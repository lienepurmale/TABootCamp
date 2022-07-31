package com.bootcampexercise.module10.finalactivity;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    private Calculator calculator;

    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    protected void tearDown() throws Exception {
        calculator = null;
        super.tearDown();
    }

    ////Min 4 test cases of add method (use both overloaded methods, don’t just create 4 test cases for 1 method)
    public void testAdd1() {
        int nr1 = 1;
        int nr2 = 1;
        assertEquals(2, calculator.add(nr1, nr2));
    }

    public void testAdd2() {
        int nr1 = 2;
        int nr2 = 2;
        int nr3 = 3;
        assertEquals(7, calculator.add2(nr1, nr2, nr3));
    }

    public void testAdd3() {
        int nr1 = 4;
        int nr2 = -2;
        assertEquals(2, calculator.add(nr1, nr2));
    }

    public void testAdd4() {
        int nr1 = -10;
        int nr2 = -5;
        int nr3 = -5;
        assertEquals(-20, calculator.add2(nr1, nr2, nr3));
    }

    public void testAdd5() {
        int nr1 = 0;
        int nr2 = 0;
        int nr3 = 0;
        assertEquals(0, calculator.add2(nr1, nr2, nr3));
    }

    //// Min 2 cases for subtract method
    public void testSub1() {
        int nr1 = 10;
        int nr2 = 5;
        assertEquals(5, calculator.sub(nr1, nr2));
    }

    public void testSub2() {
        int nr1 = 0;
        int nr2 = 0;
        assertEquals(0, calculator.sub(nr1, nr2));
    }

    public void testSub3() {
        int nr1 = 10;
        int nr2 = -10;
        assertEquals(20, calculator.sub(nr1, nr2));
    }

    //Min 2 test cases of divide method (should have at least 1 case of exception handling test condition
    public void testDiv1() {
        int nr1 = 4;
        int nr2 = 2;
        assertEquals(2, calculator.div(nr1, nr2));
    }

    public void testDiv2() throws ArithmeticException {
        int nr1 = 0;
        int nr2 = 5;
        assertEquals("Not possible to divide with 0", calculator.div(nr1, nr2));
    }
    public void testDiv3() throws ArithmeticException {
        int nr1 = 5;
        int nr2 = 0;
        assertEquals("Not possible to divide with 0", calculator.div(nr1, nr2));}

    public void testDiv4() {
        int nr1 = -4;
        int nr2 = 2;
        assertEquals(-2, calculator.div(nr1, nr2));
    }

    public void testDiv5() {
        int nr1 = -10;
        int nr2 = -2;
        assertEquals(5, calculator.div(nr1, nr2));
    }

    public void testMult1() {
        int nr1 = 2;
        int nr2 = 2;
        assertEquals(4, calculator.mult(nr1, nr2));
    }

    public void testMult2() {
        int nr1 = -2;
        int nr2 = 2;
        assertEquals(-4, calculator.mult(nr1, nr2));
    }

    public void testMult3() {
        int nr1 = 0;
        int nr2 = 2;
        assertEquals(0, calculator.mult(nr1, nr2));
    }

}

