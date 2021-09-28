/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Vuolo
 */

package ex29;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // setup r
        String rStr = "";

        // prompt for rate of return
        do {
            System.out.print("What is the rate of return? ");
            rStr = input.nextLine();
        } while (!validateR(rStr));

        // calc num years to double investment
        int numYears = calcNumYears(Float.parseFloat(rStr));

        // display years to double investment
        System.out.print("It will take " + numYears + " years to double your initial investment.");
    }

    public static int calcNumYears(float r) {
        return 72 / (int)r;
    }

    public static boolean validateR(String rStr) {
        // check if invalid
        try {
            // try to parse r from string: don't allow 0
            if (Float.parseFloat(rStr) == 0) {
                System.out.println("Sorry. That's not a valid input.");
                return false;
            }
        } catch(NumberFormatException e) {
            System.out.println("Sorry. That's not a valid input.");
            return false;
        }

        // valid
        return true;
    }
}