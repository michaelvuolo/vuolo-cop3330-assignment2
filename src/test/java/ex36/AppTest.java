/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Vuolo
 */

package ex36;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class AppTest {
    @Test
    public void average_2() {
        // create list to test with
        ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(1, 2, 3));

        App computingStatistics = new App();
        Double result = computingStatistics.average(testList);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void min_1() {
        // create list to test with
        ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(1, 2, 3));

        App computingStatistics = new App();
        int result = computingStatistics.min(testList);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void max_3() {
        // create list to test with
        ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(1, 2, 3));

        App computingStatistics = new App();
        int result = computingStatistics.max(testList);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void std() {
        // create list to test with
        ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(1, 2, 3));

        App computingStatistics = new App();
        Double result = computingStatistics.std(testList);
        Assertions.assertEquals(0.816496580927726, result);
    }
}