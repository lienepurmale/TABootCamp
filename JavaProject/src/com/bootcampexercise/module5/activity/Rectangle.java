package com.bootcampexercise.module5.activity;

public class Rectangle extends Shape {

    // TODO: Implement calculateArea and calculatePerimeter in this class
   private double a;
   private double b;
   private double perimeter;
   private double area;

    public Rectangle(){
        System.out.println("This is a rectangle");
    }

    public double calculateArea() {
        return (a*b);
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double calculatePerimeter() {
        return (a + b)*2;
    }

}
