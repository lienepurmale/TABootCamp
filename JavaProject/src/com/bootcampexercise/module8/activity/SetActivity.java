package com.bootcampexercise.module8.activity;
//Needs to be completed
import java.util.HashSet;

public class SetActivity {
    public static void main(String[] args) {
        //TODO: 1 - Type code to create a set of names.
        HashSet weekdaySet = new HashSet();
        //Also try adding a few duplicate entries to this set.

        weekdaySet.add("Monday");
        weekdaySet.add("Tuesday");
        weekdaySet.add("Wednesday");
        weekdaySet.add("Thursday");
        weekdaySet.add("Friday");
        weekdaySet.add("Saturday");
        weekdaySet.add("Sunday");
        weekdaySet.add("Friday"); //duplicate entry


        //TODO: 2 - Call print method to print the set passed as its parameter.
        //TODO: 3 - Type code to print this set
        System.out.println("Output : ");
        for (Object nameOfObject : weekdaySet) {
        System.out.println(nameOfObject.toString());
    }



    }
}
