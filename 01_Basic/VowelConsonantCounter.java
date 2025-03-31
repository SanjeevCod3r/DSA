/*
Counting Vowels and Consonants in a String
Difficulty: Easy
Topics: Basic Programming, String Manipulation
Description: Write a program to count vowels and consonants in a given string.
Example:
Input: string = "hello world"
Output: Vowels: 3, Consonants: 7
Explanation: "hello world" contains 3 vowels (e, o, o) and 7 consonants (h, l, l, w, r, l, d).
*/

import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Read a string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close(); // Close scanner to prevent resource leaks

        // Convert input to lowercase to handle case insensitivity
        input = input.toLowerCase();

        // Variables to store vowel and consonant counts
        int vowelCount = 0, consonantCount = 0;

        // Define a string containing all vowels
        String vowels = "aeiou";

        // Loop through each character in the string
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) { // Check if the character is a letter
                if (vowels.indexOf(ch) != -1) {
                    vowelCount++; // If character is in the vowel list, increment vowel count
                } else {
                    consonantCount++; // Otherwise, it's a consonant
                }
            }
        }

        // Print the results
        System.out.println("Vowels: " + vowelCount + ", Consonants: " + consonantCount);
    }
}
