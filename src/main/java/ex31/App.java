/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Vuolo
 */

package ex31;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // calculate target heart rates
        float targetHeartRate;
        try {
            // prompt for age & hr
            System.out.print("What is your resting heart rate? ");
            float restingHR = input.nextFloat();
            System.out.print("What is your age? ");
            int age = input.nextInt();

            // display entered info & setup table
            System.out.println("\nResting Pulse : " + restingHR + "      Age : " + age + "\n");
            System.out.println("Intensity    | Rate");
            System.out.println("-------------|--------");

            // display calculated target heart rates
            for (int i = 55; i <= 95; i += 5) {
                targetHeartRate = calcTargetHeartRate(restingHR, age, i);
                System.out.println(i + "%" + "          | " + Math.round(targetHeartRate) + " bpm");
            }
        } catch(Exception e) {
            // output error in input
            System.out.println("Sorry. That's not a valid input. Numbers only.");
        }
    }

    public static float calcTargetHeartRate(float restingHR, int age, int intensity) {
        return (((220 - age) - restingHR) * intensity / 100) + restingHR;
    }
}   