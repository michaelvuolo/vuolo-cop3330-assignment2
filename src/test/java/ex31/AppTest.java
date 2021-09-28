/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Vuolo
 */

package ex31;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void calcNumYears_138() {
        App karvonen = new App();
        Assertions.assertEquals(138, Math.round(karvonen.calcTargetHeartRate(65, 22, 55)));
    }
}

