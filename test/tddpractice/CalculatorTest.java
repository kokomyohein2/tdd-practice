package tddpractice;

import io.petelleave.tddpractice.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldGetZeroIfNull() {
        Calculator calculator = new Calculator();
        int result = calculator.add(null);
        assertEquals(0, result);
    }

    @Test
    public void shouldGetZeroIfEmpty() {
        Calculator calculator = new Calculator();
        int result = calculator.add("");
        assertEquals(0, result);
    }

    @Test
    public void shouldAddSingleValue() {
        Calculator calculator = new Calculator();
        int result = calculator.add("1");
        assertEquals(1, result);
    }

    @Test
    public void shouldAddMultipleValues() {
        Calculator calculator = new Calculator();
        int result = calculator.add("1,4,3,2");
        assertEquals(10, result);
    }
}
