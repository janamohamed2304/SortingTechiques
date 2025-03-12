import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

import SortingAlgorithms.*;

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
}
