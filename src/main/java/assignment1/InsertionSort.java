// Insertion sort is given a key, iterates through an array from the start to find the correct position for the key, and inserts it there.
// This is O(n^2) because for loop is O(n) and while loop is O(n) in the worst case. The best case is O(n) when the array is already sorted.

package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void sort(boolean intermidiate, int[] arr) {
        // Start timer to keep track of the time taken to sort the array
        long startTime = System.currentTimeMillis();

        // First element is left as is since it is already sorted (so arrIndex starts from 1 not 0)
        // Insert elememts starting the second element onwards
        for (int arrIndex = 1; arrIndex < arr.length; arrIndex++) {
            int key = arr[arrIndex];    // Key is the element to be inserted
            
            // The correct position for key is found by comparing it with elements from the start of the array
            int insertionIndex = 0;
            while (insertionIndex < arrIndex && arr[insertionIndex] < key) {
                insertionIndex++;    // Move onwards until key is greater than the current element
            }

            // Shift elements to the right to make space for key
            for (int k = arrIndex; k > insertionIndex; k--) {
                arr[k] = arr[k - 1];    // Assign the previous element to the current element (move it forward)
            }
            // Insert key at the correct position
            arr[insertionIndex] = key;

            if (intermidiate){
                // Print the entire array after each step
                System.out.println("Step " + arrIndex + ": " + Arrays.toString(arr) + " (key = " + key + ")");
            }
        }

        // Stop timer and print the time taken to sort the array
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }

    public static void main(String[] args) {
        boolean intermidiate = false;
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Do you want to see intermediate steps? (y/n)");
        input = scanner.nextLine();
        if (input.equals("y")) {
            intermidiate = true;
        }

        int[] arr = {5, 3, 8, 6, 2, 7};  // Example input array
        System.out.println("Before sorting: " + Arrays.toString(arr));

        sort(intermidiate, arr);  // Sort the array in-place
        System.out.println("After sorting: " + Arrays.toString(arr));
        scanner.close();
    }
}