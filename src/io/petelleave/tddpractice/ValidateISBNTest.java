package io.petelleave.tddpractice;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateISBNTest {

    @Test
    public void checkValidISBN() {
        ValidateISBN validateISBN = new ValidateISBN();
        boolean result = validateISBN.checkISBN("1413304540");
        assertTrue("first", result);
    }

    @Test
    public void ISBNNumbersEndingInAnXAreValid() {
        ValidateISBN validateISBN = new ValidateISBN();
        boolean result = validateISBN.checkISBN("012000030X");
        assertTrue(result);
    }

    @Test
    public void checkInvalidISBN() {
        ValidateISBN validateISBN = new ValidateISBN();
        boolean result = validateISBN.checkISBN("1413304543");
        assertFalse(result);
    }

    @Test(expected = NumberFormatException.class)
    public void nineDigitsIsNotAllowed() {
        ValidateISBN validateISBN = new ValidateISBN();
        boolean result = validateISBN.checkISBN("123456789");
    }

    @Test(expected = NumberFormatException.class)
    public void nonNumbersIsNotAllowed() {
        ValidateISBN validateISBN = new ValidateISBN();
        boolean result = validateISBN.checkISBN("helloworld");
    }

}