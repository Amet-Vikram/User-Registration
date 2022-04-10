package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ValidateTest {

    @Test
    void givenFirstName_beingValid_shouldReturnTrue(){
        UserEntries userInput = new UserEntries();
        try {
            Assertions.assertTrue(userInput.verifyFirstName("AMET"));
            Assertions.assertTrue(userInput.verifyFirstName("Amet"));
        } catch (InvalidEntryExceptions e) {
            System.out.println(e);
        }
    }

    @Test
    void givenFirstName_beingInValid_shouldReturnFalse(){
        UserEntries userInput = new UserEntries();
        try {
            Assertions.assertFalse(userInput.verifyFirstName("amet"));
            Assertions.assertFalse(userInput.verifyFirstName("1amet"));
            Assertions.assertFalse(userInput.verifyFirstName("Am"));
        } catch (InvalidEntryExceptions e) {
            System.out.println(e);
        }
    }

    @Test
    void givenLastName_beingValid_shouldReturnTrue() {
        UserEntries userInput = new UserEntries();
        try {
            Assertions.assertTrue(userInput.verifyLastName("VIKRAM"));
            Assertions.assertTrue(userInput.verifyLastName("Vikram"));
        } catch (InvalidEntryExceptions e) {
            System.out.println(e);
        }
    }

    @Test
    void givenLastName_beingInValid_shouldReturnFalse(){
        UserEntries userInput = new UserEntries();
        try {
            Assertions.assertFalse(userInput.verifyLastName("amet"));
            Assertions.assertFalse(userInput.verifyLastName("1amet"));
            Assertions.assertFalse(userInput.verifyLastName("Am"));
        } catch (InvalidEntryExceptions e) {
            System.out.println(e);
        }
    }

    @Test
    void  givenEmail_beingValid_shouldReturnTrue() {
        UserEntries userInput = new UserEntries();
        try {
            Assertions.assertTrue(userInput.verifyEMail("abc.xyz@bl.co.in"));
        } catch (InvalidEntryExceptions e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_beingInValid_ShouldReturnFalse() {
        UserEntries userInput = new UserEntries();
        try {
            Assertions.assertFalse(userInput.verifyEMail("abc.xyz@bl.au.aa.in"));
        } catch (InvalidEntryExceptions e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPhone_beingValid__ShouldReturnTrue() {
        UserEntries userInput = new UserEntries();
        try {
            Assertions.assertTrue(userInput.verifyMobile("91 1234567890"));
        } catch (InvalidEntryExceptions e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPhone_beingInValid_ShouldReturnFalse() {
        UserEntries userInput = new UserEntries();
        try {
            Assertions.assertFalse(userInput.verifyMobile("1234543210"));
        } catch (InvalidEntryExceptions e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_beingValid__ShouldReturnTrue() {
        UserEntries userInput = new UserEntries();
        try {
            Assertions.assertTrue(userInput.verifyPassword("Abcd@123"));
        } catch (InvalidEntryExceptions e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_beingInValid_ShouldReturnFalse() {
        UserEntries userInput = new UserEntries();
        try {
            Assertions.assertFalse(userInput.verifyPassword("Pi32oh#%"));
        } catch (InvalidEntryExceptions e) {
            System.out.println(e);
        }
    }
}