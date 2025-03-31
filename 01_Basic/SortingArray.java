/*
Sorting an Array
Difficulty: Easy
Topics: Basic Programming, Sorting Algorithms
Description: Write a program to sort an array of numbers in ascending order.
Example:
Input: array = [3, 1, 4, 1, 5, 9]
Output: [1, 1, 3, 4, 5, 9]
Explanation: The array sorted in ascending order is [1, 1, 3, 4, 5, 9].
*/
public class SortingArray {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9};
        bubbleSort(array); // Call sorting function
        System.out.println("Sorted Array: " + java.util.Arrays.toString(array));
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // Swap if elements are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

/*

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9};

        Arrays.sort(array); // Sorting in ascending order
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
 
*/

// Arrays.sort() (Dual-Pivot QuickSort)  ---->	O(n log n) ----> Best for general sorting
// Bubble Sort -->	O(n²) ----->  Learning purposes, small data
// Selection Sort --->	O(n²) ---->	When swaps are costly
// Insertion Sort ---->	O(n²) (avg), O(n) (best case) --->	Nearly sorted arrays
// Merge Sort --->	O(n log n) --->	Stable sorting, linked lists
// Quick Sort --->	O(n log n) (avg), O(n²) (worst)--->	Fastest for large random datasets