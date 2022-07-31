package com.bootcampexercise.module10.finalactivity;

import com.bootcampexercise.module7.activity.CustomExceptionActivity;

public class Calculator {
    //Create 2 add methods (apply method overloading – name of method should be same)
    public int add(int nr1, int nr2) {
        return nr1 + nr2;
    }

    public int add2(int nr1, int nr2, int nr3) {
        return nr1 + nr2 + nr3;
    }

    //Create subtract method
    public int sub(int nr1, int nr2) {
        return nr1 - nr2;
    }

    // Create divide method (apply java exception and write try and catch of invalid inputs)
    public int div(int nr1, int nr2) {
        int divResult = 0;
        try {
            if (nr1 == 0 || nr2 == 0) {
                throw new ArithmeticException();
            } else {
                divResult = nr1 / nr2;
            }
            System.out.println("Divide result is " + divResult);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Not possible to divide with 0");
        } finally {
            System.out.println("End");
        }
        return divResult;
    }

    public int mult(int nr1, int nr2) {
        return nr1 * nr2;
    }
}

