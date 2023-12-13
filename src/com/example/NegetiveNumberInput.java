package com.example;

import java.util.Scanner;

//Custom exception class for negative input
class NegativeNumberException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public NegativeNumberException(String message) {
     super(message);
 }
}

public class NegetiveNumberInput {

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     try {
         System.out.print("Enter a positive integer: ");
         int number = scanner.nextInt();

         if (number < 0) {
             throw new NegativeNumberException("Negative number entered!");
         }

         System.out.println("You entered: " + number);
     } catch (NegativeNumberException e) {
         System.out.println("Error: " + e.getMessage());
         // You can add more handling logic here if needed
     } catch (Exception e) {
         System.out.println("Error: Invalid input");
     } finally {
         scanner.close();
     }
 }
}