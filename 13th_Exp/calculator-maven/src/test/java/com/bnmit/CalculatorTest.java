package com.bnmit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(4, calc.add(2, 2));
    }

    @Test
    void testSubtract() {
        assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, calc.divide(4, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(4, 0));
    }
}