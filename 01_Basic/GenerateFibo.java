/* 
Generating the Fibonacci Series
Difficulty: Easy
Topics: Basic Programming, Sequences
Description: Write a program to generate the Fibonacci series up to a given number.
Example:
Input: limit = 10
Output: [0, 1, 1, 2, 3, 5, 8]
Explanation: The Fibonacci series up to 10 is generated as [0, 1, 1, 2, 3, 5, 8].
*/

import java.util.Scanner;

public class GenerateFibo {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Read the limit up to which Fibonacci series should be generated
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

        // Initialize the first two Fibonacci numbers
        int a = 0;
        int b = 1;

        // Print the first two numbers of the Fibonacci series
        System.out.print(a + "," + b);

        int next; // Variable to store the next Fibonacci number

        // Generate Fibonacci numbers until the next number exceeds the limit
        while ((next = a + b) <= limit) {
            System.out.print("," + next);
            a = b;   // Move to the next number in the sequence
            b = next;
        }

        // Close the scanner to prevent resource leaks
        sc.close();
    }
}

