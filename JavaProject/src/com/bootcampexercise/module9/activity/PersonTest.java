package com.bootcampexercise.module9.activity;

import junit.framework.TestCase;
public class PersonTest extends TestCase {

    private Person person;

    //TODO: create set up
    protected void setUp() throws Exception {
        super.setUp();
        person = new Person();
    }

    //TODO: create teardown
    protected void tearDown() throws Exception {
        person = null;
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
    public void testGetSetHeight() {
        float height1 = 1.2f;
        person.setHeight(height1);
        assertEquals(height1, person.getHeight()); //Positive testing for height
    }

    public void testGetSetWeight() {
        int weight1 = 120;
        person.setWeight(weight1);
        assertEquals(weight1, person.getWeight());
    }

    public void testGetSetWeight2() {
        int weight2 = 120;
        person.setWeight(weight2);
        assertEquals(weight2, person.getWeight()); 
    }

    //TODO: create unit test for getBodyMassIndex method
    public void test1BMI() {
        double BMI = person.getBMIndex(0, 0);
        assertEquals(0.0, BMI);
    }
}

