/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Vuolo
 */

package ex36;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // initialize variables
        boolean isNumValid = false;
        String curNumStr;
        ArrayList<Integer> numArr = new ArrayList<>();

        // loop until done entering numbers
        while (true) {
            // prompt for number
            System.out.print("Enter a number: ");
            curNumStr = input.nextLine();

            // check if done
            if (curNumStr.equals("done"))
                break;
            else {
                isNumValid = true;
                for (int i = 0; i < curNumStr.length(); i++) {
                    if (Character.isDigit(curNumStr.charAt(i)))
                        continue;
                    else
                        isNumValid = false;
                }

                // add num to list of numbers
                if (isNumValid)
                    numArr.add(Integer.parseInt(curNumStr));
            }
        }

        // print numbers
        System.out.print("Numbers: ");
        for (int i = 0; i < numArr.size(); i++) {
            // only print comma if not last
            if (i != numArr.size() - 1)
                System.out.print(numArr.get(i) + ", ");
            else
                System.out.println(numArr.get(i));
        }

        // display computed statistics (results)
        System.out.println("The average is " + average(numArr));
        System.out.println("The minimum is " + min(numArr));
        System.out.println("The maximum is " + max(numArr));
        System.out.printf("The standard deviation is %.2f", std(numArr));
    }

    // calculate average
    public static double average(ArrayList<Integer> numArr) {
        // initialize variables
        double average = 0;

        // sum up all values
        for (int i = 0; i < numArr.size(); i++)
            average += numArr.get(i);

        // divide by length
        average /= numArr.size();

        // output result
        return average;
    }

    // calculate maximum
    public static int max(ArrayList<Integer> numArr) {
        // end if empty array
        if (numArr.size() == 0)
            return 0;

        // keep track of maximum num
        int maxNum = numArr.get(0);
        for (int i = 1; i < numArr.size(); i++)
            if (maxNum < numArr.get(i))
                maxNum = numArr.get(i);

        // output result
        return maxNum;
    }

    // calculate minimum
    public static int min(ArrayList<Integer> numArr) {
        // end if empty array
        if (numArr.size() == 0)
            return 0;

        // keep track of maximum num
        int minNum = numArr.get(0);
        for (int i = 1; i < numArr.size(); i++)
            if (minNum > numArr.get(i))
                minNum = numArr.get(i);

        // output result
        return minNum;
    }

    // calculate standard deviation
    public static double std(ArrayList<Integer> numArr) {
        // initialize variables to help in calculation
        double sum = 0;
        double sd = 0.0;
        double mean = 0;

        // get sum of numbers
        for (int i = 0; i < numArr.size(); i++)
            sum += numArr.get(i);

        // get sum
        mean = sum / (numArr.size());

        // calculate standard deviation
        for (int i = 0; i < numArr.size(); i++)
            sd += Math.pow((numArr.get(i) - mean), 2);

        // output standard deviation
        return Math.sqrt(sd / numArr.size());
    }
}