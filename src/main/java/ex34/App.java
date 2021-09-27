/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Vuolo
 */

package ex34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // create list of 5 employees
        ArrayList<String> employees = new ArrayList<String>(Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));

        // print employees
        System.out.println("There are " + employees.size() + " employees: ");
        for (String employee : employees)
            System.out.println(employee);

        // prompt for a name to remove
        System.out.print("\nEnter an employee name to remove: ");
        String nameToDiscard = input.nextLine();

        // discard name from list
        employees.remove(nameToDiscard);

        // print employees again
        System.out.println("\nThere are " + employees.size() + " employees: ");
        for (String employee : employees)
            System.out.println(employee);
    }
}   