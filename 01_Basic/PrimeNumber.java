/*
Checking for Prime Numbers
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to determine if a number is prime.
Example:
Input: number = 7
Output: Prime
Explanation: 7 has no divisors other than 1 and itself, so it is a prime number.
*/

import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    
    boolean isPrime = true;

    if (n <= 1) {
      isPrime = false;  // Numbers <= 1 are not prime
    } else {
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          isPrime = false;  // If n is divisible by any number, it's not prime
          break;
        }
      }
    }

    if (isPrime) {
      System.out.println(n + " is a Prime Number");
    } else {
      System.out.println(n + " is NOT a Prime Number");
    }
    
    sc.close();
  }
}
