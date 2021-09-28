/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Vuolo
 */

package ex29;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void calcNumYears_18() {
        App rule72 = new App();
        Assertions.assertEquals(18, rule72.calcNumYears((float)4.0));
    }
}

