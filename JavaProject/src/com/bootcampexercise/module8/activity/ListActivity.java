package com.bootcampexercise.module8.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.List;

public class ListActivity {
    public static void main(String[] args) {
        //TODO: 1 - Type code to create a list of names. Use ArrayList.
        List newlist = new ArrayList();

        // Add an element to the list
        newlist.add("Name");
        // Insert an element at the head of the list
        newlist.add(0, "Surname");
        // Insert an element at the head of the list
        newlist.add(0, "Age");


        //TODO: 2 - Call print method to print the list passed as its parameter.
        ListActivity obj = new ListActivity();
        obj.print(newlist);
    }

    void print(List list) {
        {
            //TODO: 3 - Type code to print this list
            //Notice the order in which elements get printed.

            System.out.println(list);
        }
    }
}