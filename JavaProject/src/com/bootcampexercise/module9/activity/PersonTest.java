package com.bootcampexercise.module9.activity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;

    //TODO: create set up
    protected void SetUp() throws Exception {
        super.setUp();
        person = new Person();
    }

    //TODO: create teardown
    protected void tearDown() throws Exception {
        person = null;
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
    public void GetSetHeightTest() {
        int height1 = 120;
        person.setWeight(height1);
        assertEquals(0, person.getHeight()); //Positive testing for height
    }

    public void GetSetHeightTest2() {
        int height2 = 220;
        person.setWeight(height2);
        assertEquals(0, person.getHeight()); //Negative testing for height
    }

    public void GetSetWeightTest() {
        int weight1 = 45;
        person.setWeight(weight1);
        assertEquals(0, person.getWeight()); //Positive testing for Weight
    }

    public void GetSetWeightTest2() {
        int weight2 = 120;
        person.setWeight(weight2);
        assertEquals(0, person.getWeight()); //Negative testing for Weight
    }

    //TODO: create unit test for getBodyMassIndex method

    public void bmiTest1() {
        double BMI = person.getBMIndex(0, 0);
        assertEquals(0.0, BMI);
    }

    public void bmiTest2() {
        double BMI = person.getBMIndex(60, 1f);
        double bmiExpected = 100 / Math.sqrt(-2.0);
        assertEquals(bmiExpected, BMI);
    }

    public void bmiTest3() {
        double BMI = person.getBMIndex(120, 2f);
        double bmiExpected = 100 / Math.sqrt(-2.0);
        assertEquals(bmiExpected, BMI);
    }

    public void bmiTest4() {
        double BMI = person.getBMIndex(60, 2.5f);
        double bmiExpected = 100 / Math.sqrt(-2.0);
        assertEquals(bmiExpected, BMI);
    }

    public void bmiTest5() {
        double BMI = person.getBMIndex(-60, 1f);
        double bmiExpected = -100 / Math.sqrt(-2.0);
        assertEquals(bmiExpected, BMI);
    }
}








