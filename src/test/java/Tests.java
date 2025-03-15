import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

import SortingAlgorithms.*;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tests{


    @Test
    public void testInsertionSortBestCase() {
        int[] arr = {-5, -4, -3, -2, -1, 0, 1, 2, 3};
        int[] expectedArr = {-5, -4, -3, -2, -1, 0, 1, 2, 3};
        InsertionSort.sort(arr, false);
        assertArrayEquals(expectedArr, arr);
    }



    @Test
    public void TestInsertionSortRepeatedelementss() {
        int[] arr = {5, 3, 5, 3, 5, 3, 5, 3};
        int[] expectedArr = {3, 3, 3, 3, 5, 5, 5, 5};
        InsertionSort.sort(arr, false);
        assertArrayEquals(expectedArr, arr);
    }

    // Best cases (Already sorted acscendingly)

    @Test
    public void testInsertionSortReversedArray() {
        int[] arr = {100000, 10000, 1000, 100, 10, 1};
        int[] expectedArr = {1, 10, 100, 1000, 10000, 100000};
        InsertionSort.sort(arr, false);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void testInsertionSortAveragecase2() {
        int[] arr = {0, 100, -50, 25, -25, 75, -100};
        int[] expectedArr = {-100, -50, -25, 0, 25, 75, 100};
        InsertionSort.sort(arr, false);
        assertArrayEquals(expectedArr, arr);
    }
    @Test
    public void testCountingSortBestCase() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        CountingSort.Sort(arr, false);
        assertArrayEquals(expectedArr, arr);

    }

    @Test
    public void testCountingSortAverageCase() {
        int[] arr = {-5, 2, -4, 2, -5, -3};
        int[] expectedArr = {-5, -5, -4, -3, 2, 2};
        CountingSort.Sort(arr, false);
        assertArrayEquals(expectedArr, arr);

    }

    @Test
    public void testCountingSortNegativeNumbers() {
        int[] arr = {-1, -7, 0, -10, 6, 3};
        int[] expectedArr = {-10, -7, -1, 0, 3, 6};
        CountingSort.Sort(arr, false);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void testCountingSortLargeRanges() {
        int[] arr = {1, 1000, -500, 750, 250};
        int[] expectedArr = {-500, 1, 250, 750, 1000};
        CountingSort.Sort(arr, false);
        assertArrayEquals(expectedArr, arr);

    }

    @Test
    public void testQuickSortBestCase() {
        int[] arr = {5, 6, 7, 8, 9, 10, 11, 12};
        int[] expectedArr = {5, 6, 7, 8, 9, 10, 11, 12};
        QuickSort q = new QuickSort();
        q.Sort(arr, false);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void testQuickSortAverageCase() {
        int[] arr = {20, 5, 3, 8, 1, 2, 16, 4};
        int[] expectedArr = {1, 2, 3, 4, 5, 8, 16, 20};
        QuickSort q = new QuickSort();
        q.Sort(arr, false);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void testQuickSortWorseCase() {
        int[] arr = {20, 19, 18, 17, 16, 15, 13, 10};
        int[] expectedArr = {10, 13, 15, 16, 17, 18, 19, 20};
        QuickSort q = new QuickSort();
        q.Sort(arr, false);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void testQuickSortNegatineNumbers() {
        int[] arr = {-5, -8, -3, -11, -1, 0, -8};
        int[] expectedArr = {-11, -8, -8, -5, -3, -1, 0};
        QuickSort q = new QuickSort();
        q.Sort(arr, false);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void testEffecincy() {

        int[] sortedarray = {1, 2, 3, 4, 5};
        int[] reeversed = {8, 7, 3, 0, -1, -10};
        int[] average = {1, 7, 4, 10, 6, 9, -1, 8, 0};

        System.out.println("Sorted Array");
        long startTime = System.nanoTime();
        CountingSort.Sort(sortedarray, false);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time taken for (Counting sort)= " + duration + " nanoseconds");


        sortedarray = new int[]{1, 2, 3, 4, 5};
        startTime = System.nanoTime();
        InsertionSort.sort(sortedarray, false);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken for (insertion sort)= " + duration + " nanoseconds");


        sortedarray = new int[]{1, 2, 3, 4, 5};
        QuickSort q = new QuickSort();
        startTime = System.nanoTime();
        q.Sort(sortedarray, false);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken for (Quick sort)= " + duration + " nanoseconds");


        System.out.println("reversed Array");
        startTime = System.nanoTime();
        CountingSort.Sort(reeversed, false);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken for (Counting sort)= " + duration + " nanoseconds");


        reeversed = new int[]{8, 7, 3, 0, -1, -10};
        startTime = System.nanoTime();
        InsertionSort.sort(reeversed, false);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken for (insertion sort)= " + duration + " nanoseconds");


        reeversed = new int[]{8, 7, 3, 0, -1, -10};
        QuickSort q1 = new QuickSort();
        startTime = System.nanoTime();
        q1.Sort(reeversed, false);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken for (Quick sort)= " + duration + " nanoseconds");


        System.out.println("Average Array");
        startTime = System.nanoTime();
        CountingSort.Sort(average, false);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken for (Counting sort)= " + duration + " nanoseconds");


        average = new int[]{1, 7, 4, 10, 6, 9, -1, 8, 0};
        startTime = System.nanoTime();
        InsertionSort.sort(average, false);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken for (insertion sort)= " + duration + " nanoseconds");


        average = new int[]{1, 7, 4, 10, 6, 9, -1, 8, 0};
        QuickSort q2 = new QuickSort();
        startTime = System.nanoTime();
        q2.Sort(average, false);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken for (Quick sort)= " + duration + " nanoseconds");


    }


    @Test
    public void testSortingEfficiencyONRandomInput() {
        Random rand = new Random();

        // Generate a random size between 10 and 1000
        int size = rand.nextInt(1000) + 10;
        int[] arr = new int[size];
        int[] expectedArr = new int[size];
        long startTime;
        long endTime;
        long insertionTime = 0;
        long countingTime = 0;
        long QuickTime = 0;

        // Fill the array with random values in the range [-10000, 10000]
        for (int k = 0; k < 30; k++) {
            for (int i = 0; i < size; i++) {
                arr[i] = rand.nextInt(20001) - 10000;
                expectedArr[i] = arr[i];
            }

            Arrays.sort(expectedArr);

            //Insertion Sort
            int[] insertionArr = arr.clone();
            startTime = System.nanoTime();
            InsertionSort.sort(insertionArr, false);
            endTime = System.nanoTime();
            insertionTime = insertionTime + (endTime - startTime) / 10000;


            // Counting Sort
            int[] countingArr = arr.clone();
            startTime = System.nanoTime();
            CountingSort.Sort(countingArr, false);
            endTime = System.nanoTime();
            countingTime = countingTime + (endTime - startTime) / 10000;


            // Quick Sort
            int[] QuickArr = arr.clone();
            QuickSort q = new QuickSort();
            startTime = System.nanoTime();
            q.Sort(QuickArr, false);
            endTime = System.nanoTime();
            QuickTime = QuickTime + (endTime - startTime) / 10000;
        }
        System.out.println("Random Array Size: " + size);
        System.out.println("Insertion Sort mean Time: " + insertionTime / 30 + " ms");
        System.out.println("Counting Sort mean Time: " + countingTime / 30 + " ms");
        System.out.println("Quick Sort Time: " + QuickTime / 30 + " ns");
        System.out.println("---------------------------");

    }


}
