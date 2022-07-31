package com.bootcampexercise.module10.finalactivity;

import java.util.List;

//Employee class should extend Person class
public class Employee extends Person {
    //Create attributes: jobTitle, company, salary
    private String company;
    private double salary;
    private String jobTitle;

    //Add different constructors
    public Employee(String company, String jobTitle, double salary) {
        this.company = company;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    //Extra constructor
    public Employee() {
        this.company = "Unknown";
        this.salary = 800;
        this.jobTitle = "developer";
        System.out.println("I am from company " + company + " and my salary is " + salary);
    }

    public String getCompany() {

        return company;
    }

    public void setCompany(String company) {

        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String title) {
        this.jobTitle = jobTitle;
    }

    //Override method introduce of person class ->
    //"My name is <name> and I am <age> years old
    //I am work as <jobTitle> in <company>“ and my salary is <salary>

    public void introduce() {
        System.out.println("My name is " + getName() + " and I am " + getAge() + " years old");
        System.out.println("I am working as " + getJobTitle() + " in " + getCompany() + " and my salary is " + getSalary());
    }

    //Create method which returns the name of the employee whose salary is highest among the 5
    //getHighestPaidEmp() [This method should be in Employee Class created in activity2]

    public String getHighestPaidEmp(List<Employee> list) {
        

    }
}




