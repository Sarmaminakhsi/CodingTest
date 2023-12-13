package com.example;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceofCount {
    public static void main(String[] args) {
        
        String inputString = "Hello to our programming World!";

        
        Map<Character, Integer> charCountMap = occurrenceofCount (inputString);

        //  Display the character counts
        System.out.println("Character counts in the given string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }


    private static Map<Character, Integer> occurrenceofCount(String inputString) {
		// TODO Auto-generated method stub
	

	

        // Initialize a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        //  Iterate through each character in the input string
        for (char ch : inputString.toCharArray()) {
          // Update the count in the map
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

       
        return charCountMap;
    }
}

