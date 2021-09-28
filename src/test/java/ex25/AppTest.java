/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Vuolo
 */

package ex25;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    // - 4 is a very strong password
    // - 3 is a strong password
    // - 2 is a weak password
    // - 1 is a very weak password
    @Test
    public void passwordValidator_VeryWeak_1() {
        App passwordStrengthIndicator = new App();
        Assertions.assertEquals(1, passwordStrengthIndicator.passwordValidator("12345"));
        Assertions.assertNotEquals(1, passwordStrengthIndicator.passwordValidator("abcdef"));
    }

    @Test
    public void passwordValidator_Weak_2() {
        App passwordStrengthIndicator = new App();
        Assertions.assertEquals(2, passwordStrengthIndicator.passwordValidator("abcdef"));
        Assertions.assertNotEquals(2, passwordStrengthIndicator.passwordValidator("abc123xyz"));
    }

    @Test
    public void passwordValidator_Strong_3() {
        App passwordStrengthIndicator = new App();
        Assertions.assertEquals(3, passwordStrengthIndicator.passwordValidator("abc123xyz"));
        Assertions.assertNotEquals(3, passwordStrengthIndicator.passwordValidator("1337h@xor!"));
    }

    @Test
    public void passwordValidator_VeryStrong_4() {
        App passwordStrengthIndicator = new App();
        Assertions.assertEquals(4, passwordStrengthIndicator.passwordValidator("1337h@xor!"));
        Assertions.assertNotEquals(4, passwordStrengthIndicator.passwordValidator("abcdef"));
    }
}

