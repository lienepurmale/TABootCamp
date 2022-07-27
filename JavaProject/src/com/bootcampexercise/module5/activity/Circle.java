package com.bootcampexercise.module5.activity;

public class Circle extends Shape {

    // TODO: Implement calculateArea and calculatePerimeter in this class
    private double radius;
    private String color;
   public Circle(){
       System.out.println("This is circle");
}
    private static final double Pi = 3.14;



    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double calculateArea() {
        return (Pi*(radius*radius));
    }

    public double calculatePerimeter() {
        return Pi*radius;
    }

}
