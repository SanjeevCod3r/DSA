/*
 Determining Even/Odd Numbers
Difficulty: Easy
Topics: Basic Programming
Description: Write a program to check whether a number is even or odd.
Example:
Input: number = 4
Output: Even
Explanation: Since 4 is divisible by 2, it is an even number.
 */

 import java.util.*;
public class EvenOdd {
   public static void main(String[] args) {
     // Creating a Scanner object to take user input
     Scanner sc = new Scanner(System.in);
     
     // Prompting the user to enter a number
     System.out.print("Enter a number: ");
     int n = sc.nextInt();
     
     // Checking if the number is even or odd
     if(n % 2 == 0) {  // (n & 1) == 0 also use this logic
         System.out.println("Number is Even"); // If the remainder is 0, it's even
     } else {
         System.out.println("Number is Odd"); // Otherwise, it's odd
     }
     
     // Closing the Scanner to prevent resource leaks
     sc.close();
   }
 }
 

 