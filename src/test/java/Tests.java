import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

import SortingAlgorithms.*;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tests {
    // Worst cases (Sorted in descending order)
    @Test
    public void insertionTest1 ()
    {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expectedArr = {1, 2, 3, 4, 5};
        InsertionSort.sort(arr, false);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void insertionTest2 ()
    {
        int[] arr = {100, 50, 20, 10, 5, 2, 1};
        int[] expectedArr = {1, 2, 5, 10, 20, 50, 100};
        InsertionSort.sort(arr, false);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void insertionTest3 ()
    {
        int[] arr = {5, 3, 5, 3, 5, 3, 5, 3};
        int[] expectedArr = {3, 3, 3, 3, 5, 5, 5, 5};
        InsertionSort.sort(arr, false);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void insertionTest4 ()
    {
        int[] arr = {50, 40, 30, 20, 10, 5, 1, 0};
        int[] expectedArr = {0, 1, 5, 10, 20, 30, 40, 50};
        InsertionSort.sort(arr, false);
        assertArrayEquals(expectedArr, arr);
    }

    // Best cases (Already sorted acscendingly)
    @Test
    public void insertionTest5 ()
    {
        int[] arr = {-5, -4, -3, -2, -1, 0, 1, 2, 3};
        int[] expectedArr = {-5, -4, -3, -2, -1, 0, 1, 2, 3};
        InsertionSort.sort(arr, false);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void insertionTest6 ()
    {
        int[] arr = {100000, 10000, 1000, 100, 10, 1};
        int[] expectedArr = {1, 10, 100, 1000, 10000, 100000};
        InsertionSort.sort(arr, false);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void insertionTest7 ()
    {
        int[] arr = {1, 1, 1, 1, 1, 1, 1};
        int[] expectedArr = {1, 1, 1, 1, 1, 1, 1};
        InsertionSort.sort(arr, false);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void insertionTest8 ()
    {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int[] expectedArr = {2, 4, 6, 8, 10, 12, 14};
        InsertionSort.sort(arr, false);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void insertionTest9 ()
    {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        InsertionSort.sort(arr, false);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void insertionTest10 ()
    {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expectedArr = {1, 2, 3, 4, 5};
        InsertionSort.sort(arr, false);
        assertArrayEquals(expectedArr, arr);
    }

    // Average cases (Random Unsorted)
    @Test
    public void insertionTest11 ()
    {
        int[] arr = {3, 1, 4, 1, 5, 9, 5, 2, 6, 5};
        int[] expectedArr = {1, 1, 2, 3, 4, 5, 5, 5, 6, 9};
        InsertionSort.sort(arr, false);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void insertionTest12 ()
    {
        int[] arr = {0, 100, -50, 25, -25, 75, -100};
        int[] expectedArr = {-100, -50, -25, 0, 25, 75, 100};
        InsertionSort.sort(arr, false);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void insertionTest13 ()
    {
        int[] arr = {-5, -4, -3, -2, -1, 0, 1, 2, 3};
        int[] expectedArr = {-5, -4, -3, -2, -1, 0, 1, 2, 3};
        InsertionSort.sort(arr, false);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void insertionTest14 ()
    {
        int[] arr = {100, 10, 50, 5, 75, 25, 1, 101};
        int[] expectedArr = {1, 5, 10, 25, 50, 75, 100, 101};
        InsertionSort.sort(arr, false);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void insertionTest15 ()
    {
        int[] arr = {70, 31, 8, 45, 67, 20, 9, 11, 55};
        int[] expectedArr = {8, 9, 11, 20, 31, 45, 55, 67, 70};
        InsertionSort.sort(arr, false);
        assertArrayEquals(expectedArr, arr);
    }
    @Test
    public void testCountingSortBestCase(){
        int[] arr ={1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        CountingSort.Sort(arr,false);
        assertArrayEquals(expectedArr,arr);

    }

    @Test
    public void testCountingSortAverageCase(){
        int[] arr = {-5,2,-4,2,-5,-3};
        int[] expectedArr = {-5,-5,-4,-3,2,2};
        CountingSort.Sort(arr,false);
        assertArrayEquals(expectedArr,arr);

    }
    @Test
    public void testCountingSortNegativeNumbers(){
        int[] arr = {-1,-7,0,-10,6,3};
        int[] expectedArr = {-10,-7,-1,0,3,6};
        CountingSort.Sort(arr,false);
        assertArrayEquals(expectedArr,arr);
    }

    @Test
    public void testCountingSortLargeRanges(){
        //large ranges
        int[] arr = {1, 1000, -500, 750, 250};
        int[] expectedArr = {-500,1,250,750,1000};
        long startTime = System.nanoTime();
        CountingSort.Sort(arr,false);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time taken (Counting large ranges)= "+duration+" nanoseconds");
        assertArrayEquals(expectedArr,arr);

    }
    @Test
    public void testEffecincy(){

        int[] sortedarray={1,2,3,4,5,4};
        int[] reeversed={8,7,3,0,-1,-10};
        int[] average={1,7,4,10,6,9,-1,8,0};

        System.out.println("Sorted Array");
        long startTime = System.nanoTime();
        CountingSort.Sort(sortedarray,false);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time taken for (Counting sort)= "+duration+" nanoseconds");


        sortedarray= new int[]{1, 2, 3, 4, 5, 4};
        startTime = System.nanoTime();
        InsertionSort.sort(sortedarray,false);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken for (insertion sort)= "+duration+" nanoseconds");


//         sortedarray= new int[]{1, 2, 3, 4, 5, 4};
//         startTime = System.nanoTime();
//        //Qicksort
//         endTime = System.nanoTime();
//         duration = endTime - startTime;
//         System.out.println("Time taken for (Quick sort)= "+duration+" nanoseconds");


        System.out.println("reversed Array");
        startTime = System.nanoTime();
        CountingSort.Sort(reeversed,false);
         endTime = System.nanoTime();
         duration = endTime - startTime;
        System.out.println("Time taken for (Counting sort)= "+duration+" nanoseconds");


        reeversed= new int[]{8, 7, 3, 0, -1, -10};
        startTime = System.nanoTime();
        InsertionSort.sort(reeversed,false);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken for (insertion sort)= "+duration+" nanoseconds");


//         sortedarray= new int[]{1, 2, 3, 4, 5, 4};
//         startTime = System.nanoTime();
//        //Qicksort
//         endTime = System.nanoTime();
//         duration = endTime - startTime;
//         System.out.println("Time taken for (Quick sort)= "+duration+" nanoseconds");


        System.out.println("Average Array");
        startTime = System.nanoTime();
        CountingSort.Sort(average,false);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken for (Counting sort)= "+duration+" nanoseconds");


        average= new int[]{1, 2, 3, 4, 5, 4};
        startTime = System.nanoTime();
        InsertionSort.sort(average,false);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken for (insertion sort)= "+duration+" nanoseconds");


//         sortedarray= new int[]{1, 2, 3, 4, 5, 4};
//         startTime = System.nanoTime();
//        //Qicksort
//         endTime = System.nanoTime();
//         duration = endTime - startTime;
//         System.out.println("Time taken for (Quick sort)= "+duration+" nanoseconds");



    }


    @Test
    public void testSortingEfficiencyONRandomInput() {
        Random rand = new Random();

        // Generate a random size between 10 and 10,000
        int size = rand.nextInt(9991) + 10;
        int[] arr = new int[size];
        int[] expectedArr = new int[size];

        // Fill the array with random values in the range [-10000, 10000]
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(20001) - 10000;
            expectedArr[i] = arr[i];
        }

        Arrays.sort(expectedArr);

       //Insertion Sort
        int[] insertionArr = arr.clone();
        long startTime = System.nanoTime();
        InsertionSort.sort(insertionArr, false);
        long endTime = System.nanoTime();
        long insertionTime = endTime - startTime;

       // Counting Sort
        int[] countingArr = arr.clone();
        startTime = System.nanoTime();
        CountingSort.Sort(countingArr,false);
        endTime = System.nanoTime();
        long countingTime = endTime - startTime;

        System.out.println("Random Array Size: " + size);
        System.out.println("Insertion Sort Time: " + insertionTime + " ns");
        System.out.println("Counting Sort Time: " + countingTime + " ns");
        System.out.println("---------------------------");

        assertArrayEquals(expectedArr, insertionArr);
        assertArrayEquals(expectedArr, countingArr);
    }






}
