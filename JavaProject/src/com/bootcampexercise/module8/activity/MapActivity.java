package com.bootcampexercise.module8.activity;
//Needs to be completed

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class MapActivity {
    public static void main(String[] args) {
        //1 - Type code to create a HashMap of key value pair
        //where key is id of type String and value is a name
        //2 - Call print method to print the map passed as its parameter.
        Map numbers = new HashMap();
        numbers.put("1", "One'");
        numbers.put("2", "Two'");
        numbers.put("3", "Three'");
        numbers.put("4", "Four'");
        numbers.put("5", "Five'");

        MapActivity obj = new MapActivity();
        obj.print(numbers);
    }
    void print(Map map)
    {
        Set keySet = map.keySet();

        System.out.println("*************************************");
        System.out.println("Key\tValue");
        Iterator it = keySet.iterator();
        while (it.hasNext()){
            String key = (String) it.next();
            System.out.println(key + "\t" + map.get(key));
        }
        System.out.println("*************************************");


    }
}
