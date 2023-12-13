package com.example;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> stringSet = new HashSet<>();

        // Adding elements to the HashSet
        stringSet.add("Apple");
        stringSet.add("Orange");
        stringSet.add("Banana");
        stringSet.add("Apple"); // Adding a duplicate value
        stringSet.add("Orange"); // Adding another duplicate value

        // Displaying the HashSet
        System.out.println("HashSet elements: " + stringSet);
    }
}