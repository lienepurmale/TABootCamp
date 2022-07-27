package com.bootcampexercise.module5.activity;

public class AbstractActivity {
    public static void main(String args[]) {

        Rectangle rectangle = new Rectangle();
        rectangle.setColor("White");
        System.out.println(rectangle.getColor());
        rectangle.setA(5);
        rectangle.setB(7);
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());

        // set and Print color of circle
        Circle circle = new Circle();
        circle.setColor("Black");
        System.out.println(circle.getColor());
        circle.setRadius(8);
        System.out.println(circle.calculatePerimeter());
        System.out.println(circle.calculateArea());


        // set and Print color of rectangle
        // Give area of rectangle
        // Print perimeter of rectangle


        // set and Print color of circle


        // set and Print color of circle
        // Give area of circle
        // Print perimeter of circle

    }
}

