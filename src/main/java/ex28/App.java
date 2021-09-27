/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Vuolo
 */

package ex28;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // initialize total
        int total = 0;

        // loop for 5 numbers
        for (int i = 0; i < 5; i++) {
            // prompt for number
            System.out.print("Enter a number: ");

            // add total
            total += input.nextInt();
        }

        // display total
        System.out.println("The total is " + total + ".");
    }
}