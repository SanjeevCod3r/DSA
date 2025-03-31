import java.util.Scanner;

public class MergeSort {
    
    // Merge function to merge two sorted halves into a single sorted array
    public static void merge(int nums[], int start, int mid, int end){
        int temp[] = new int[end - start + 1]; // Temporary array to store merged values
        int left = start; // Left subarray pointer
        int right = mid + 1; // Right subarray pointer
        int index = 0; // Index for the temporary array
        
        // Merge elements from both halves into temp[]
        while(left <= mid && right <= end){
            if(nums[left] < nums[right]) temp[index++] = nums[left++];
            else temp[index++] = nums[right++];
        }
        
        // Copy remaining elements from left subarray (if any)
        while(left <= mid) temp[index++] = nums[left++];
        
        // Copy remaining elements from right subarray (if any)
        while(right <= end) temp[index++] = nums[right++];
        
        // Copy merged elements back to original array
        index = 0;
        while(start <= end) nums[start++] = temp[index++];
    }

    // MergeSort function to recursively divide and sort the array
    public static void mergeSort(int nums[], int start, int end){
        if(start == end) return; // Base case: when the subarray has only one element
        
        // Calculate middle index
        int mid = start + (end - start) / 2;
        
        // Recursively sort the left half
        mergeSort(nums, start, mid);
        
        // Recursively sort the right half
        mergeSort(nums, mid + 1, end);
        
        // Merge the two sorted halves
        merge(nums, start, mid, end);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input for the array size
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        // Taking input for array elements
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        // Calling mergeSort function
        mergeSort(arr, 0, n - 1);
        
        // Printing the sorted array
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        
        sc.close(); // Closing the scanner
    }
}