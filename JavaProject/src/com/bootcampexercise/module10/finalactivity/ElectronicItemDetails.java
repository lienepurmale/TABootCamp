//Create itemHashMap with String name and double price
//Create a  method public double returnPriceOfItem(HashMap itemHashMap,name)
//In main method Add 4 items in hashmap – TV, Refrigerator, Washing Machine, Laptop
//system.out.println(“Price of TV is “+ returnPriceOfItem(<parameter1>,<parameter2>))
//for the reference https://www.w3schools.com/java/java_hashmap.asp

package com.bootcampexercise.module10.finalactivity;
import java.util.HashMap;
import java.util.Map;

public class ElectronicItemDetails {
    public static void main(String[] args){

    Map<String, Double> itemHashMap= new HashMap<>();

    itemHashMap.put("TV", 1.1);
    itemHashMap.put ("Refrigerator",2.2);
    itemHashMap.put ("Washing Machine", 3.3);
    itemHashMap.put ("Laptop", 4.4);


    ElectronicItemDetails tv = new ElectronicItemDetails();
    System.out.println("The price of the TV is " + tv.returnPriceOfItem(itemHashMap, "TV")); }

    public double returnPriceOfItem(Map<String, Double> map, String name){
        return map.get(name);}

}
