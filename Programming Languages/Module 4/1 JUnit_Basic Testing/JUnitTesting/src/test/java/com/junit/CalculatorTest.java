package com.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp(){

        System.out.println("Setting up Calculator...");

        calculator = new Calculator();

    }

    @After
    public void tearDown(){

        System.out.println("Cleaning resources...");

        calculator = null;

    }

    @Test
    public void testAddition(){

        int a = 20;
        int b = 10;

        int result = calculator.add(a,b);

        assertEquals(30,result);

    }

    @Test
    public void testSubtraction(){

        int a = 30;
        int b = 15;

        int result = calculator.subtract(a,b);

        assertEquals(15,result);

    }

}