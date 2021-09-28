/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Vuolo
 */

package ex28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // initialize numbers list
        List<Integer> numbers = new ArrayList<>();

        // read 5 numbers from user
        for (int i = 0; i < 5; i++) {
            // prompt for number
            System.out.print("Enter a number: ");

            // add total
            numbers.add(input.nextInt());
        }

        // calculate total
        int total = calculateTotal(numbers);

        // display total
        System.out.println("The total is " + total + ".");
    }

    // calculate total function for testing
    public static int calculateTotal(List<Integer> numbers) {
        // initialize total
        int total = 0;

        // loop for 5 numbers
        for (int number : numbers)
            total += number;

        // return calculated total
        return total;
    }
}