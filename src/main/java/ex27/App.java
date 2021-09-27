/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Vuolo
 */

package ex27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // prompt for user's information
        System.out.print("Enter the first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter the last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zipCode = input.nextLine();
        System.out.print("Enter the employee ID: ");
        String employeeID = input.nextLine();

        // find errors
        List<String> errorStatements = validateInput(firstName, lastName, zipCode, employeeID);

        // display errors
        for (String error : errorStatements)
            System.out.println(error);
    }

    public static List<String> validateInput(String firstName, String lastName, String zipCode, String employeeID) {
        // store error statements in a list
        List<String> errorStatements = new ArrayList<String>();

        // validate each input
        if (!validateName(firstName, false))
            errorStatements.add("The first name must be at least 2 characters long.");
        if (!validateName(firstName, true))
            errorStatements.add("The first name must be filled in.");
        if (!validateName(lastName, false))
            errorStatements.add("The last name must be at least 2 characters long.");
        if (!validateName(lastName, true))
            errorStatements.add("The last name must be filled in.");
        if (!validateEmployeeID(employeeID))
            errorStatements.add("The employee ID must be in the format of AA-1234.");
        if (!validateZipCode(zipCode))
            errorStatements.add("The zipcode must be a 5 digit number.");

        // return error statements
        return errorStatements;
    }

    public static boolean validateName(String name, boolean checkFilledIn) {
        // check filled in if specified
        if (checkFilledIn) {
            if (name.length() == 0)
                return false;
        }
        // check for at least 2 characters
        else if (name.length() < 2)
            return false;

        // valid
        return true;
    }

    public static boolean validateEmployeeID(String employeeID) {
        // check for AA-1234 format
        for (int i = 0; i < employeeID.length(); i++) {
            if (i <= 1 && !Character.isLetter(employeeID.charAt(i)))
                return false;
            else if (i == 2 && employeeID.charAt(i) != '-')
                return false;
            else if (i >= 3 && !Character.isDigit(employeeID.charAt(i)))
                return false;
        }

        // valid
        return true;
    }

    public static boolean validateZipCode(String zipCode) {
        // check for 5-digit number
        if (zipCode.length() != 5)
            return false;

        // check for numbers only
        for (int i = 0; i < zipCode.length(); i++)
            if (!Character.isDigit(zipCode.charAt(i)))
                return false;

        // valid
        return true;
    }
}