package com.bootcampexercise.module10.finalactivity;

public abstract class Person {
    private int age;
    private String name;

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
    public abstract void personIntro();
}
