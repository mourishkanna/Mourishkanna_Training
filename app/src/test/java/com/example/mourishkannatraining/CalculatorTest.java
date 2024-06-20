package com.example.mourishkannatraining;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    Calculator calculator;
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    public void testAdd() {
        int expected = 30;
        int actual = calculator.add(10,20);
        assertEquals(expected,actual);
    }

    public  void testMul(){
        int expected = 20;
        int actual = calculator.multiply(5,4);
        assertEquals(expected,actual);
    }

    public void testSubstract() {
        int expected = 10;
        int actual = calculator.substract(20,10);
        assertEquals(expected,actual);
    }
}