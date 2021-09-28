/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Vuolo
 */

package ex26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void calculateMonthsUntilPaidOff_70() {
        PaymentCalculator paymentCalculator = new PaymentCalculator();
        Assertions.assertEquals(70, paymentCalculator.calculateMonthsUntilPaidOff(5000, 12, 100));
        Assertions.assertNotEquals(70, paymentCalculator.calculateMonthsUntilPaidOff(5000, 12, 200));
    }
}

