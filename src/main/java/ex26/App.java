/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Vuolo
 */

package ex26;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // prompt for credit card information (and convert to two decimal places - nearest cent)
        System.out.print("What is your balance? ");
        float b = new BigDecimal(input.nextFloat()).setScale(2, RoundingMode.HALF_UP).floatValue();
        System.out.print("What is the APR on the card (as a percent)? ");
        float apr = new BigDecimal(input.nextFloat()).setScale(2, RoundingMode.HALF_UP).floatValue();
        System.out.print("What is the monthly payment you can make? ");
        float p = new BigDecimal(input.nextFloat()).setScale(2, RoundingMode.HALF_UP).floatValue();

        // calculate months to pay off card
        int numMonths = new PaymentCalculator().calculateMonthsUntilPaidOff(b, apr, p);

        // output months to pay off card
        System.out.print("It will take you " + numMonths + " months to pay off this card.");
    }
}

class PaymentCalculator {
    public int calculateMonthsUntilPaidOff(float b, float apr, float p) {
        // calculate daily rate
        float i = apr / 100 / 365;

        // return number of months to pay off
        return (int) Math.ceil((-1 / 30.0) * Math.log(1 + b / p * (1 - Math.pow(1 + i, 30))) / Math.log(1 + i));
    }
}