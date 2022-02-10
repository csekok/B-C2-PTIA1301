package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals("3 + 5 = 8", Calculator.add(3, 5));
    }

    @Test
    public void testAddZero() {
        assertEquals("3 + 0 = 3", Calculator.add(3, 0));
    }

    @Test
    public void testSubtract() {
        assertEquals("3 - 5 = -2", Calculator.subtract(3, 5));
    }

    @Test
    public void testSubtractZero() {
        assertEquals("3 - 0 = 3", Calculator.subtract(3, 0));
    }

    @Test
    public void testMultiply() {
        assertEquals("3 * 5 = 15", Calculator.multiply(3, 5));
    }

    @Test
    public void testMultiplyWithZero1() {
        assertEquals("0 * 5 = 0", Calculator.multiply(0, 5));
    }

    @Test
    public void testMultiplyWithZero2() {
        assertEquals("3 * 0 = 0", Calculator.multiply(3, 0));
    }

    @Test
    public void testDivide() {
        assertEquals("3 / 5 = 0.6", Calculator.divide(3, 5));
    }

    @Test
    public void testDivideWithZero() {
        assertEquals("Cannot divide with 0.", Calculator.divide(3, 0));
    }

    @Test
    public void testDivideZero() {
        assertEquals("0 / 5 = 0", Calculator.divide(0, 5));
    }
}