/*
Finding the Least Common Multiple (LCM)
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find the LCM of two numbers.
Example:
Input: a = 12, b = 15
Output: 60
Explanation: The LCM of 12 and 15 is 60.
*/

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Read two numbers from the user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        sc.close(); // Close scanner to prevent resource leaks

        // Calculate LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
        int lcm = (a * b) / findGCD(a, b);

        // Print the LCM result
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }  

    // Method to calculate GCD using the Euclidean Algorithm (Recursive Approach)
    public static int findGCD(int a, int b) {
        if (b == 0) return a; // Base case: when remainder becomes 0, return GCD
        return findGCD(b, a % b); // Recursive call: GCD(b, remainder of a/b)
    }
}

