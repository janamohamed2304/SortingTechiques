import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import assignment1.InsertionSort;

public class Tests {
    // Worst cases
    @Test
    public void insertionTest1 ()
    {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expectedArr = {1, 2, 3, 4, 5};
        InsertionSort.sort(false, arr);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void insertionTest2 ()
    {
        int[] arr = {100, 50, 20, 10, 5, 2, 1};
        int[] expectedArr = {1, 2, 5, 10, 20, 50, 100};
        InsertionSort.sort(false, arr);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void insertionTest3 ()
    {
        int[] arr = {5, 3, 5, 3, 5, 3, 5, 3};
        int[] expectedArr = {3, 3, 3, 3, 5, 5, 5, 5};
        InsertionSort.sort(false, arr);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void insertionTest4 ()
    {
        int[] arr = {50, 40, 30, 20, 10, 5, 1, 0};
        int[] expectedArr = {0, 1, 5, 10, 20, 30, 40, 50};
        InsertionSort.sort(false, arr);
        assertArrayEquals(expectedArr, arr);
    }
}
