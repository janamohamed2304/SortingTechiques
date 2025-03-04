package SortingAlgorithms;

import java.util.Arrays;
import java.util.List;

public class QuickSort {

    public void Sort(List<Integer> arr, int start, int end){

        if(end <= start) return;

        int pivot = partition(arr,start,end);
        Sort(arr,start,pivot-1);
        Sort(arr,pivot+1,end);
    }

    public int partition(List<Integer> arr , int start, int end){

        int pivot = arr.get(end);
        int i = start-1;

        for(int j = start; j <= end ; j++){
            if(arr.get(j) < pivot){
                i++;
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        i++;
        int temp = arr.get(i);
        arr.set(i, arr.get(end));
        arr.set(end, temp);

        return i;
    }

}
