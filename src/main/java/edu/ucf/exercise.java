/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Vuolo
 */

package edu.ucf;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        // prompt for name
        System.out.print("What is your name? ");

        // create new scanner
        Scanner input = new Scanner(System.in);

        // read user's name
        String name = input.nextLine();

        // output
        System.out.print("Hello, " + name + ", nice to meet you!");
    }
}
