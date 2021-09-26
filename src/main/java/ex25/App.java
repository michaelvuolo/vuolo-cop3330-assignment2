/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Vuolo
 */

package ex25;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // prompt for password
        System.out.print("Enter a password: ");
        String password = input.nextLine();

        // get password strength
        int passwordStrength = passwordValidator(password);
        String passwordStrengthStr = passwordStrength == 1 ? "very weak" : passwordStrength == 2 ? "weak" : passwordStrength == 3 ? "strong" : "very strong";

        System.out.print("The password '" + password + "' is a " + passwordStrengthStr + " password.");
    }

    // ranks password based on its strength
    // - 4 is a very strong password
    // - 3 is a strong password
    // - 2 is a weak password
    // - 1 is a very weak password
    public static int passwordValidator(String password) {
        // convert to char array
        char[] passwordCharArray = password.toCharArray();

        // setup strength components
        boolean hasLetters = false;
        boolean hasNumbers = false;
        boolean hasSpecialChars = false;

        // check for strength components
        for (char c : passwordCharArray) {
            if (!hasLetters && Character.isLetter(c))
                hasLetters = true;
            if (!hasNumbers && Character.isDigit(c))
                hasNumbers = true;
            if (!hasSpecialChars && String.valueOf(c).matches("(?i)[^a-z0-9]"))
                hasSpecialChars = true;
        }

        // determine strength and return strength value accordingly
        if (hasLetters && hasNumbers && hasSpecialChars && passwordCharArray.length >= 8)
            return 4;
        else if (hasLetters && hasNumbers && passwordCharArray.length >= 8)
            return 3;
        else if (hasLetters)
            return 2;
        else
            return 1;
    }
}
