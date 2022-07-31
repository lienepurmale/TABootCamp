package com.bootcampexercise.module10.finalactivity;

import java.util.ArrayList;
import java.util.List;


public class EmployeeList {

    public static void main(String[] args) {
        //Create 5 employee objects using constructor of the Employee class(Created in the Activity 2)

        Employee employee1 = new Employee("Company1", "Developer", 100);
        Employee employee2 = new Employee("Company2", "Tester", 200);
        Employee employee3 = new Employee("Company3", "Gamer", 300);
        Employee employee4 = new Employee("Company4", "Director", 400);
        Employee employee5 = new Employee("Company5", "CEO", 500);

        //Create list (List <Employee >empList=new ArrayList <Employee>();)of Employees
        // and add all the employee objects in the list

        List<Employee> empList = new ArrayList<Employee>();
        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);
        empList.add(employee4);
        empList.add(employee5);

        //Create method which returns the name of the employee whose salary is highest among the 5
        //getHighestPaidEmp() [This method should be in Employee Class created in activity2]


        //Print the statement : “The Employee whose salary is the highest is :”+getHighestPaidEmp()
        System.out.println("The employee whose salary is the highest is " + );


    }
}
