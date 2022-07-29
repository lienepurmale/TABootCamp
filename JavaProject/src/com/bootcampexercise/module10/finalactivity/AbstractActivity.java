package com.bootcampexercise.module10.finalactivity;
//call introduce from employee
//call introduce from student
public class AbstractActivity {
    public static void main(String[] args) {
        Students newStudent = new Students();
        Employee newEmployee = new Employee();

        System.out.println("Intro from student");
        newStudent.personIntro();
        System.out.println("Intro from employee");
        newEmployee.personIntro();

    }
}
