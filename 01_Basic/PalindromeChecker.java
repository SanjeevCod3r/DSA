/*
Identifying Palindromes
Difficulty: Easy
Topics: Basic Programming, String Manipulation
Description: Write a program to check if a string or number is a palindrome.
Example:
Input: string = "radar"
Output: Palindrome
Explanation: "radar" reads the same backward as forward. 
*/

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string or number: ");
        String input = sc.nextLine();
        sc.close(); // Close scanner to prevent resource leaks

        // Check if the input is a palindrome
        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    // Method to check if a given string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            // Compare characters from start and end
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If mismatch found, it's not a palindrome
            }
            left++;
            right--;
        }
        return true; // If loop completes, it's a palindrome
    }
}


/*
Alternate Approch:

public static boolean isPalindrome(String str) {
    return str.equals(new StringBuilder(str).reverse().toString());
} 
    
*/