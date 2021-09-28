/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Vuolo
 */

package ex28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class AppTest {
    @Test
    public void calculateTotal_15() {
        App addingNumbers = new App();
        Assertions.assertEquals(15, addingNumbers.calculateTotal(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5))));
    }
}

