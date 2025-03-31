/* 
Finding the Greatest Common Divisor (GCD)
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find the GCD of two numbers.
Example:
Input: a = 48, b = 18
Output: 6
Explanation: The GCD of 48 and 18 is 6.
*/

import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) {
         // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Read two numbers from the user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        sc.close(); // Close scanner to prevent resource leaks

        // Calculate GCD using the iterative method
        int gcd = findGCD(a, b);

        // Print the GCD result
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }

    // Method to calculate GCD using the Euclidean algorithm (Iterative)
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b; // Replace b with remainder of a/b
            a = temp;  // Swap values
        }
        return a;
    }
}


/*
 // Recursive method to calculate GCD using Euclidean Algorithm

    public static int gcd(int a, int b) {
        if (b == 0) return a; // Base case
        return gcd(b, a % b); // Recursive call
    } 

*/

/*

-> The Greatest Common Divisor (GCD), also known as the Greatest Common Factor (GCF) or Highest Common Factor (HCF), 
is the largest number that divides two or more numbers without leaving a remainder.

Example:

Find GCD of 48 and 18
Factors of 48:
1, 2, 3, 4, 6, 8, 12, 16, 24, 48

Factors of 18:
1, 2, 3, 6, 9, 18

Common Factors:
1, 2, 3, 6

Greatest Common Factor:
6

Thus, GCD(48, 18) = 6 ✅ 


How to Find GCD?
1. Prime Factorization Method
Break numbers into prime factors.
Multiply the common prime factors.

🔹 Example: GCD(60, 48)

60 = 2 × 2 × 3 × 5
48 = 2 × 2 × 2 × 3

Common factors: 2 × 2 × 3 = 12
GCD(60, 48) = 12 ✅

2. Euclidean Algorithm (Efficient Method)
Uses the formula:

GCD(a,b) = GCD(b, a mod b)
Keep dividing until the remainder is 0.
*/