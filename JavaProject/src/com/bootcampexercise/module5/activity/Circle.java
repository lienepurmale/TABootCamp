package com.bootcampexercise.module5.activity;

public class Circle extends Shape {

    // TODO: Implement calculateArea and calculatePerimeter in this class
    private double radius;
    private String color;
   public Circle(){
       System.out.println("This is circle");
}
    private static final double pi = 3.14;



    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double calculateArea() {
        return (pi*(radius*radius));
    }

    public double calculatePerimeter() {
        return pi*radius;
    }

}
