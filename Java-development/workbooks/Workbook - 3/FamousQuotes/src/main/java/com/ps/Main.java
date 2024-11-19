package com.ps;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Step 1: Declare and Initialize the array of quotes
        String[] quotes = new String[]{
                "The journey of a thousand miles begins with one step.",
                "What we think, we become.",
                "Life is 10% what happens to us and 90% how we react to it.",
                "Success is not how high you have climbed, but how you make a positive difference to the world.",
                "Happiness is not by chance, but by choice.",
                "Strive not to be a success, but rather to be of value.",
                "Believe you can and you're halfway there.",
                "Difficulties in life are intended to make us better, not bitter.",
                "In the middle of every difficulty lies opportunity.",
                "The best way to predict the future is to create it."
        };

        // Step 2: Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continueLoop = true;  // Loop control variable

        // Step 3: Add a loop to keep showing quotes until the user decides to exit
        while (continueLoop) {
            try {
                // Step 4: Prompt the user to select a quote or display a random one
                System.out.println("Enter a number between 1 and 10 to select a quote, or 0 for a random quote: ");
                int choice = scanner.nextInt();  // Read the user's choice

                // Step 5: Handle valid input (1-10 or 0 for random)
                if (choice == 0) {
                    // Display a random quote
                    int randomIndex = random.nextInt(10);  // Get a random quote index
                    System.out.println(quotes[randomIndex]);
                } else if (choice >= 1 && choice <= 10) {
                    // Display the quote corresponding to the user's choice
                    System.out.println(quotes[choice - 1]);  // Adjust for zero-based index
                } else {
                    // Handle invalid input (number not between 1 and 10)
                    System.out.println("Invalid input. Please enter a number between 1 and 10.");
                }

                // Step 6: Ask if the user wants to see another quote
                System.out.println("Would you like to see another quote? (yes/no)");
                scanner.nextLine();  // Clear the newline
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("no")) {
                    continueLoop = false;  // Exit the loop if the user says no
                }

            } catch (InputMismatchException e) {
                // Handle invalid input (like entering a string instead of a number)
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();  // Clear the invalid input
            }
        }

        System.out.println("Goodbye!");  // End the program
    }
}