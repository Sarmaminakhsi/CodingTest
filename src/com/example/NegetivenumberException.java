package com.example;

import java.util.Scanner;

// Custom exception class
class NegativeException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeException(String s) {
        // Call constructor of parent Exception
        super(s);
    }
}

public class NegetivenumberException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter positive integer: ");
            int userInput = scanner.nextInt();

            // Check if the input is negative
            if (userInput < 0) {
                throw new NegativeException("Error: Negative number entered!");
            }

            // If input is valid, display positve number
            System.out.println("You entered: " + userInput);
        } catch (NegativeException e) {
            // Handle the custom exception
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Handle other exceptions (e.g., InputMismatchException)
            System.out.println("Error: Invalid input. Please enter a positive integer.");
        } finally {
            scanner.close();
        }
    }
}
