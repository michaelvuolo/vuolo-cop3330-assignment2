/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Vuolo
 */

package ex27;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void validateName_True() {
        App inputValidator = new App();
        Assertions.assertTrue(inputValidator.validateName("Conroy", false));
        Assertions.assertFalse(inputValidator.validateName("", true));
    }

    @Test
    public void validateZipCode_True() {
        App inputValidator = new App();
        Assertions.assertTrue(inputValidator.validateZipCode("12345"));
        Assertions.assertFalse(inputValidator.validateZipCode("ABCDE"));
    }

    @Test
    public void validateEmployeeID_True() {
        App inputValidator = new App();
        Assertions.assertTrue(inputValidator.validateEmployeeID("AA-1234"));
        Assertions.assertFalse(inputValidator.validateEmployeeID("A12-1234"));
    }
}

