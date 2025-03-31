/*
Finding Prime Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find all prime numbers within a given range.
Example:
Input: range = [10, 30]
Output: [11, 13, 17, 19, 23, 29]
Explanation: Prime numbers between 10 and 30 are 11, 13, 17, 19, 23, and 29. 
*/
import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Read the range from the user
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();

        // Close the scanner to prevent resource leaks
        sc.close();

        // Print prime numbers in the given range
        System.out.print("Prime numbers between " + start + " and " + end + " are: ");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false; // Numbers less than 2 are not prime
        for (int i = 2; i * i <= num; i++) { // Check divisibility up to √num
            if (num % i == 0) {
                return false; // If divisible, not a prime number
            }
        }
        return true; // If no divisors found, it's prime
    }
}
