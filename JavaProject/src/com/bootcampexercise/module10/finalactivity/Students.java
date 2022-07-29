package com.bootcampexercise.module10.finalactivity;
//Create class Students extend Person class

public class Students extends Person {
//Create attribute schoolName
    private String schoolName;
//Create getters and setters for attribute

    public String getschoolName() {
        return schoolName;    }

    public void setSchoolName(String schoolName)
    {
        this.schoolName = schoolName;
    }

//Students class should extend to Person class
// Override method introduce of person -> "I am study in university <schoolName>“

    public void personIntro() {
        System.out.println("I am studying in university" + this.schoolName);
    }
}
