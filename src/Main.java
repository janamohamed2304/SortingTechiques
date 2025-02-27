import SortingAlgorithms.CountingSort;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CountingSort sorter = new CountingSort();
        int[] arr = {-1,0,9,-4,2,-6};
        List<int[]> steps = sorter.Sort(arr, true);
        for (int[] step : steps) {
            System.out.println(Arrays.toString(step));
        }
    }
    }
