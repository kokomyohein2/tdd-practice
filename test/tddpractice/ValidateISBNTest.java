package tddpractice;

import io.petelleave.tddpractice.ValidateISBN;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidateISBNTest {

    @Test
    public void checkValid10DigitISBN() {
        ValidateISBN validateISBN = new ValidateISBN();
        boolean result = validateISBN.checkISBN("1413304540");
        assertTrue("first", result);
    }

    @Test
    public void checkAValid13DigitISBN() {
        ValidateISBN validateISBN = new ValidateISBN();
        boolean result = validateISBN.checkISBN("9781853260087");
        assertTrue("first value", result);
         result = validateISBN.checkISBN("9781853267338");
        assertTrue("second value", result);

    }

    @Test
    public void TenDigitISBNNumbersEndingInAnXAreValid() {
        ValidateISBN validateISBN = new ValidateISBN();
        boolean result = validateISBN.checkISBN("012000030X");
        assertTrue(result);
    }

    @Test
    public void checkInvalid10DigitISBN() {
        ValidateISBN validateISBN = new ValidateISBN();
        boolean result = validateISBN.checkISBN("1413304543");
        assertFalse(result);
    }

    @Test
    public void checkInvalid13DigitISBN() {
        ValidateISBN validateISBN = new ValidateISBN();
        boolean result = validateISBN.checkISBN("9781853267335");
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