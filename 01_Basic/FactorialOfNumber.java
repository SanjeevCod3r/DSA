/*
Finding the Factorial of a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to compute the factorial of a given number.
Example:
Input: number = 5
Output: 120
Explanation: 5! (factorial) is 5 × 4 × 3 × 2 × 1 = 120.
*/

import java.util.Scanner;

public class FactorialOfNumber { 
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close(); // Close scanner to prevent resource leaks

        // Calculate factorial using a loop
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply each number in the range
        }

        // Print the factorial result
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}

