import java.util.Scanner;

public class QuickSort {

    // Partition function to place the pivot element at its correct position
    public static int partition(int[] arr, int start, int end) {
        int pos = start; // Position of the pivot element
        for (int i = start; i <= end; i++) {
            if (arr[i] <= arr[end]) { // Compare with pivot (last element)
                // Swap elements to place smaller elements before the pivot
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++; // Move position forward
            }
        }
        return pos - 1; // Return the final position of the pivot
    }

    // QuickSort function to sort the array recursively
    public static void quick(int[] arr, int start, int end) {
        // Base case: If the start index is greater or equal to the end index, return
        if (start >= end) {
            return;
        }

        // Partition the array and get the pivot index
        int pivot = partition(arr, start, end);
        
        // Recursively sort the left subarray
        quick(arr, start, pivot - 1);
        
        // Recursively sort the right subarray
        quick(arr, pivot, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input for the array size
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        // Taking input for array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Calling quicksort function
        quick(arr, 0, n - 1);
        
        // Printing the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close(); // Closing the scanner
    }  
}