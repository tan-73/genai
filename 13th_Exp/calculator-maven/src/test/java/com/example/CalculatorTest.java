package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc;

    @BeforeEach
    void setUp() { calc = new Calculator(); }

    @Test
    void testAdd() { assertEquals(10, calc.add(3, 7)); }

    @Test
    void testSubtract() { assertEquals(5, calc.subtract(9, 4)); }

    @Test
    void testMultiply() { assertEquals(12, calc.multiply(3, 4)); }

    @Test
    void testDivide() { assertEquals(2.5, calc.divide(5, 2)); }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
}