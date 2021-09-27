/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Vuolo
 */

package ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // initialize variables
        String curName;
        ArrayList<String> names = new ArrayList<String>();
        Random rand = new Random();

        // loop until done entering names
        do {
            // prompt for name
            System.out.print("Enter a name: ");
            curName = input.nextLine();

            // add name to array
            names.add(curName);
        } while (!curName.isEmpty()); // don't allow blank entry

        // remove blank entry
        names.remove(names.size() - 1);

        // display random winner
        System.out.println("The winner is... " + names.get(rand.nextInt(names.size())) + ".");
    }
}   