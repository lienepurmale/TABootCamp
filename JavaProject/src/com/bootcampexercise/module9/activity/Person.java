package com.bootcampexercise.module9.activity;

public class Person {
    private int weight;
    private float height;

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }

    public double getBMIndex(int weight, float height) {
        double BMI = 0;
        if (height > 0 && weight > 0 && weight < 100 && height < 2) {
            BMI = weight / Math.sqrt(height);
            System.out.println("Result " + BMI + " BMI");
        } else if (weight > 100 && height > 2) {
            System.out.println("Result invalid");
        }
        return BMI;
    }
}