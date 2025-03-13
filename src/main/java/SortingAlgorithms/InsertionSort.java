package SortingAlgorithms;

import java.util.*;

public class InsertionSort {
    public static List<int[]> sort(int[] arr, boolean intermediate) {
        List<int[]> intermediateArrays = new ArrayList<>();
      //  long startTime = System.nanoTime();
        
        // First element is left as is since it is already sorted (so arrIndex starts from 1 not 0)
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

            if (intermediate) {
                intermediateArrays.add(Arrays.copyOf(arr, arr.length));
            }
        }
        
        if (!intermediate) {
            intermediateArrays.add(Arrays.copyOf(arr, arr.length));
        }

//        long endTime = System.nanoTime();
//        long duration = endTime - startTime;
//        System.out.println("Time taken = "+duration+" nanoseconds");
        
        return intermediateArrays;
    }
}
