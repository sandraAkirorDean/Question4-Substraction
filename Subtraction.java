package vu.question4;

import java.util.Scanner;
import java.util.Random;

public class Subtraction {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Random random = new Random();
            boolean playAgain = true; // Use a descriptive variable name
            while (playAgain) {
                // Generate two random single-digit integers
                int number1 = random.nextInt(10);  // Generate a random integer between 0 and 9
                int number2 = random.nextInt(10);  // Generate another random integer between 0 and 9
                
                // Ensure number1 is greater than or equal to number2, if not, swap them
                if (number1 < number2) {
                    int temp = number1;
                    number1 = number2;
                    number2 = temp;
                }
                
                // Prompt the student with the subtraction question
                System.out.println("What is " + number1 + " - " + number2 + "?");
                
                // Get the student's answer
                int answer = input.nextInt();
                input.nextLine();  // Consume the newline character left by nextInt()
                
                // Check if the student's answer is correct
                if (answer == (number1 - number2)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect. The correct answer is " + (number1 - number2));
                }
                
                // Ask if the user wants to play again
                System.out.println("Do you want to play again? (yes/no)");
                String response = input.nextLine();
                
                if (!response.equalsIgnoreCase("yes")) {
                    playAgain = false; // Set playAgain to false to exit the loop
                }
                
                // Separator after each loop
                System.out.println("");
            }
            // Close the scanner to release resources
        }
    }
}