package com.bootcampexercise.module10.finalactivity;

public class Employee extends Person {

    private String company;
    private double salary;
    private String title;

    //Add different constructors
    public Employee() {
        System.out.println("I am a developer");
    }

    public Employee() {
        System.out.println("I am a teacher");
    }

    //Add getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double setSalary() {
        return salary;
    }

    public double getSalary() {
        this.salary = salary;
    }
    //Override method introduce of person class ->
    //"My name is <name> and i am <age> years old
    //I am work as <jobTitle> in <company>“ and my salary is <salary>

    public void personIntro() {
        System.out.println("My name is" + getName() + "and I am " + getAge() + "years old");
        System.out.println("");
    }
}




