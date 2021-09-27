/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Vuolo
 */

package ex38;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // prompt to enter list
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String numberListStr = input.nextLine();

        // split numbers by space into list
        String numberList[] = numberListStr.split(" ");

        // grab even numbers from list
        Integer evenNumberList[] = filterEvenNumbers(numberList);

        // display even numbers
        System.out.print("The even numbers are ");
        for (int i = 0; i < evenNumberList.length; i++)
            // only add space if it's not the last element
            if (i < evenNumberList.length - 1)
                System.out.print(evenNumberList[i] + " ");
            else
                System.out.print(evenNumberList[i] + ".");
    }

    // get all even numbers from list
    public static Integer[] filterEvenNumbers(String list[]) {

        // init new array
        ArrayList<Integer> newList = new ArrayList<>();

        // add even numbers to array
        for(int i = 0; i < list.length; i++){
            // convert string number to integer number
            int num = Integer.parseInt(list[i]);

            // check if even
            if (num % 2 == 0)
                newList.add(num);
        }

        // convert array to list
        Integer[] evenNumArr = newList.toArray(new Integer[newList.size()]);

        // return arr
        return evenNumArr;
    }
}