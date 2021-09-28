/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Vuolo
 */

package ex40;

import java.util.*;

public class App {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // setup employees
        Employee[] employeeArray = {
                new Employee("John","Johnson","Manager",20161231),
                new Employee("Tou","Xiong","Software Engineer",20161005),
                new Employee("Michaela", "Michaelson", "District Manager", 20151219),
                new Employee("Jake","Jacobson","Programmer",00000000),
                new Employee("Jackquelyn", "Jackson", "DBA",00000000),
                new Employee("Sally","Webber","Web Developer",20151218)
        };

        // convert array to list
        List<Employee> employeeList = Arrays.asList(employeeArray);

        // prompt for search string
        System.out.print("Enter a search string: ");
        String searchPhrase = input.nextLine();

        // search for employees
        List<Employee> searchResults = searchForEmployee(employeeList, searchPhrase);

        // check if employees are found
        if (searchResults.size() == 0) {
            System.out.println("Could not find any employees with the given search term.");
            return;
        }

        // print table header
        System.out.println("\nResults: \n");
        System.out.println("Name \t\t\t\t | Position \t\t  | Separation Date");
        System.out.println("---------------------|--------------------|-----------------");

        // output sorted employees in table
        for (Employee employee : searchResults) {
            // display formatted employee info
            System.out.println(String.format("%-20s | %-18s | %-8s", employee.getFirstName() + " " + employee.getLastName(), employee.getPosition(), employee.getSeparationDateFormatted()));
        }
    }

    public static List<Employee> searchForEmployee(List<Employee> employeeList, String searchPhrase) {
        // init new array of found employees from search
        List<Employee> foundEmployees = new ArrayList<>();

        // begin search
        for (Employee employee : employeeList)
            if (employee.getFirstName().toUpperCase().contains(searchPhrase.toUpperCase()) || employee.getLastName().toUpperCase().contains(searchPhrase.toUpperCase()))
                foundEmployees.add(employee);

        // return search results
        return foundEmployees;
    }
}

class Employee {
    // initialize aspects of employee
    private String firstName;
    private String lastName;
    private String position;
    private double separationDate;

    // constructor
    public Employee(String firstName, String lastName, String position, double separationDate) {
        // setup employee
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;
    }

    // firstName mutator
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // firstName accessor
    public String getFirstName() {
        return firstName;
    }

    // lastName mutator
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // lastName accessor
    public String getLastName() {
        return lastName;
    }

    // position mutator
    public void setPlacement(String position) {
        this.position = position;
    }

    // position accessor
    public String getPosition() {
        return position;
    }

    // separation date mutator
    public void setSeparationDate(double separationDate) {
        this.separationDate = separationDate;
    }

    // separation date accessor
    public double getSeparationDate() {
        return separationDate;
    }

    // format separation date to a readable format
    public String getSeparationDateFormatted() {
        // init output string
        String formattedSeparationDate = "";
        String separationDateStr = String.format("%8.0f", separationDate);

        // begin formatting separation date
        if (separationDate != 0.0)
            formattedSeparationDate = separationDateStr.substring(0, 4) + "-" + separationDateStr.substring(4, 6) + "-" + separationDateStr.substring(6, 8);

        return formattedSeparationDate;
    }
}