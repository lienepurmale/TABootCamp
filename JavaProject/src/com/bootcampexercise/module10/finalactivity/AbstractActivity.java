package com.bootcampexercise.module10.finalactivity;
//call introduce from employee
//call introduce from student
public class AbstractActivity {
    public static void main(String[] args) {

        Employee employee1= new Employee();
        employee1.setName("Liene");
        employee1.setAge(28);
        employee1.setJobTitle("developer");
        employee1.setCompany("Asos");
        employee1.introduce();

        Students students1= new Students();
        students1.setSchoolName("Cambridge");
        students1.introduce();




    }
}
