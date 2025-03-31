/*
Finding the Sum of Elements in an Array
Difficulty: Easy
Topics: Basic Programming, Arrays
Description: Write a program to find the sum of elements in an array.
Example:
Input: array = [1, 2, 3, 4, 5]
Output: 15
Explanation: The sum of the elements in the array is 15. 
*/
public class SumOfArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int num : array) {  // Loop through each element
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}

/*

import java.util.Arrays;
public class SumWithStreams {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(array).sum(); // Using Streams API

        System.out.println("Sum of array elements: " + sum);
    }
} 
*/
