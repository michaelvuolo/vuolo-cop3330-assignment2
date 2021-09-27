/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Vuolo
 */

package ex33;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // keep an array of possible responses
        String[] responses = { "Yes", "No", "Maybe", "Ask again later" };

        // Create random object
        Random random = new Random();

        // prompt user for question
        System.out.print("What's your question?\n> ");
        String question = input.nextLine();

        // generate random number and get response
        int randomResponseIndex = random.nextInt(responses.length);
        String response = responses[randomResponseIndex];

        // display response
        System.out.print("\n" + response + ".");
    }
}   