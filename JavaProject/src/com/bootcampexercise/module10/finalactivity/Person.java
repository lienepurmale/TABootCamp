package com.bootcampexercise.module10.finalactivity;
//Create Person class (It should be abstract class)
//Create attributes in Person class: name, age
public abstract class Person {
    private int age;
    private String name;

    public Person(String name, int age){
        this.name= name;
        this.age= age;
    }
    public Person(){
        this.name= "Liene";
        this.age= 28;
    }
    // Create setters and getters for attributes

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //Define introduce method
    public abstract void personIntro();
}
