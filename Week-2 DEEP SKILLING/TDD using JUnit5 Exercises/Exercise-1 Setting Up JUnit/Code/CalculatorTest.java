package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        int a = 10;
        int b = 40;
        int sum = a + b;
        assertEquals(50, sum);
    }
}
