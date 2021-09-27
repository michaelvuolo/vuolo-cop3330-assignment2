/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Vuolo
 */

package ex32;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // welcome user to game
        System.out.println("Let's play Guess the Number!");

        // get random number
        int randomNumber = (int) (Math.random() * 999 + 1);

        // initialize variables
        int curGuess;
        int totalGuesses;
        int difficultyLevel;

        while (true) {
            totalGuesses = 0;
            // prompt for difficulty
            System.out.print("\nEnter the difficulty level (1, 2, or  3): ");
            difficultyLevel = input.nextInt();

            // check difficulty
            if (difficultyLevel == 1)
                randomNumber = (int) (Math.random() * 10 + 1);
            else if (difficultyLevel == 2)
                randomNumber = (int) (Math.random() * 100 + 1);
            else
                randomNumber = (int) (Math.random() * 1000 + 1);

            // begin guessing
            System.out.print("I have my number. What's your guess?: ");
            do {
                // record user's guess
                curGuess = input.nextInt();

                // count number of guesses
                totalGuesses++;

                // determine whether correct, high, or low
                if (curGuess == randomNumber)
                    System.out.println("You got it in " + totalGuesses + " guesses!");
                else if (curGuess < randomNumber)
                    System.out.print("Too low. Guess again: ");
                else if (curGuess > randomNumber)
                    System.out.print("Too high. Guess again: ");

            } while (curGuess != randomNumber);

            // prompt to play again
            System.out.print("\nDo you wish to play again (Y/N)? ");
            String choice = input.next();
            if (choice.equalsIgnoreCase("n"))
                break;
        }
    }
}   