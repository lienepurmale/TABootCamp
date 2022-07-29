package com.bootcampexercise.module10.finalactivity;

import com.bootcampexercise.module6.activity.Mammal;

public class ActivityClass {
    public static void main(String arg[]) {

        Vehicle bike = new Bike();
        Vehicle car = new Car();

        bike.start();
        bike.stop();

        car.start();
        car.stop();
    }
}