/*
Finding the Largest and Smallest Numbers in an Array
Difficulty: Easy
Topics: Basic Programming, Arrays
Description: Write a program to find the largest and smallest numbers in an array.
Example:
Input: array = [4, 7, 1, 8, 5]
Output: Largest: 8, Smallest: 1
Explanation: The largest number in the array is 8 and the smallest is 1.
*/
import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Declare an array of size 'n'
        int[] arr = new int[n];

        // Read array elements from the user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Close the scanner to prevent resource leaks
        sc.close();

        // Find the largest and smallest numbers in the array
        int min = arr[0]; // Assume first element is the smallest
        int max = arr[0]; // Assume first element is the largest

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update min if a smaller element is found
            }
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
        }

        // Print the results
        System.out.println("Smallest: " + min + ", Largest: " + max);
    }
}

