/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Vuolo
 */

package ex37;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // initialize variables
        String specialChars = "!@#&()–[{}]:;'?/*$^+=<>";
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        Random random = new Random();

        // init letters to list
        List<Character> lettersList = new ArrayList<>();
        for (char ch: letters.toCharArray())
            lettersList.add(ch);

        // init special chars to list
        List<Character> specialCharsList = new ArrayList<>();
        for (char ch: specialChars.toCharArray())
            specialCharsList.add(ch);

        // init numbers to list
        List<Character> numbersList = new ArrayList<>();
        for (char ch: nums.toCharArray())
            numbersList.add(ch);

        // prompt for password info
        System.out.print("What's the minimum length? ");
        int minLength = input.nextInt();
        System.out.print("How many special characters? ");
        int numSpecialChars = input.nextInt();
        System.out.print("How many numbers? ");
        int numNumbers = input.nextInt();

        // init empty password to generate
        String password = "";

        // add random letters
        for (int i = 0; i < minLength - numSpecialChars - numNumbers; i++)
            password += lettersList.get(random.nextInt(lettersList.size()));

        // add random special characters
        for(int i = 0; i < numSpecialChars; i++)
            password += specialCharsList.get(random.nextInt(specialCharsList.size()));

        // add random numbers
        for(int i = 0; i < numNumbers; i++)
            password += numbersList.get(random.nextInt(numbersList.size()));

        // randomize generated password
        char passwordCharArr[] = password.toCharArray();
        for (int i = passwordCharArr.length - 1; i > 0; i--) {
            // swap letter after current
            int j = random.nextInt(i + 1);
            char temp = passwordCharArr[i];
            passwordCharArr[i] = passwordCharArr[j];
            passwordCharArr[j] = temp;
        }

        // display final generated password
        System.out.println("Your password is " + new String(passwordCharArr));
    }
}