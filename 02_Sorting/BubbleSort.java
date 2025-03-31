import java.util.Scanner;

class BubbleSort {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read the number of elements in the array
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Read the elements of the array from the user
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Bubble Sort Algorithm
        // Outer loop for passes through the array
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for pairwise comparisons
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the current element is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        // Close the scanner to prevent memory leaks
        sc.close();
    }
}