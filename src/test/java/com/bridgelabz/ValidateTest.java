package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidateTest {
    Validate validate = new Validate();

    @Test
    void givenFirstName_beingValid_shouldReturnTrue() {

        Assertions.assertTrue(validate.isValidFirstName("AMET"));
        Assertions.assertTrue(validate.isValidFirstName("Amet"));
    }

    @Test
    void givenFirstName_beingInValid_shouldReturnFalse(){
        Assertions.assertFalse(validate.isValidFirstName("amet"));
        Assertions.assertFalse(validate.isValidFirstName("1amet"));
        Assertions.assertFalse(validate.isValidFirstName("Am"));
    }

    @Test
    void givenLastName_beingValid_shouldReturnTrue() {
        Assertions.assertTrue(validate.isValidLastName("VIKRAM"));
        Assertions.assertTrue(validate.isValidLastName("Vikram"));
    }

    @Test
    void givenLastName_beingInValid_shouldReturnFalse(){
        Assertions.assertFalse(validate.isValidLastName("amet"));
        Assertions.assertFalse(validate.isValidLastName("1amet"));
        Assertions.assertFalse(validate.isValidLastName("Am"));
    }

    @Test
    void  givenEmail_beingValid_shouldReturnTrue() {
        Assertions.assertTrue(validate.isValidEmail("abc.xyz@bl.co.in"));
    }

    @Test
    public void givenEmail_beingInValid_ShouldReturnFalse() {
        Assertions.assertFalse(validate.isValidEmail("abc.xyz@bl.au.aa.in"));
    }

    @Test
    public void givenPhone_beingValid__ShouldReturnTrue() {
        Assertions.assertTrue(validate.isValidPhone("91 1234567890"));
    }

    @Test
    public void givenPhone_beingInValid_ShouldReturnFalse() {
        Assertions.assertFalse(validate.isValidPhone("1234543210"));
    }

    @Test
    public void givenPassword_beingValid__ShouldReturnTrue() {
        Assertions.assertTrue(validate.isValidPassword("Abcd@123"));
    }

    @Test
    public void givenPassword_beingInValid_ShouldReturnFalse() {
        Assertions.assertFalse(validate.isValidPassword("Pi32oh#%"));
    }
}