/*
Summing Digits of a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to calculate the sum of digits of a number.
Example:
Input: number = 1234
Output: 10
Explanation: The sum of the digits 1 + 2 + 3 + 4 = 10. 
*/

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Read an integer input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Variable to store the sum of digits
        int sum = 0;

        // Loop to extract and sum each digit
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            sum += digit;            // Add digit to sum
            number = number / 10;    // Remove the last digit
        }

        // Print the final sum of digits
        System.out.println("Sum of digits: " + sum);

        // Close the scanner to prevent resource leaks
        sc.close();
    }
}
