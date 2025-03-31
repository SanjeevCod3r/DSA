/*
Reversing a String
Difficulty: Easy
Topics: Basic Programming, String Manipulation
Description: Write a program to reverse a given string.
Example:
Input: string = "programming"
Output: "gnimmargorp"
Explanation: The reversed string of "programming" is "gnimmargorp". 
*/
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Read the string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close(); // Close scanner to prevent resource leaks

        // Reverse the string using a loop
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // Append characters in reverse order
        }

        // Print the reversed string
        System.out.println("Reversed String: " + reversed);
    }
}

/*

import java.util.Scanner;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        // Close the scanner to prevent resource leaks
        sc.close();

        // Using StringBuilder's built-in reverse() method to reverse the string
        String reversed = new StringBuilder(input).reverse().toString();

        // Display the reversed string
        System.out.println("Reversed String: " + reversed);
    }
}


*/
