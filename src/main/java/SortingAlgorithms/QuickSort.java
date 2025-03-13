package SortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    private List<int[]> intermediateArrays = new ArrayList<>();

    public List<int[]> Sort(int [] list , Boolean steps){

        if(list.length <= 1){
            this.intermediateArrays.add(list);
            return this.intermediateArrays;
        }

        Qsort(list,0,list.length-1);

        return this.intermediateArrays;
    }

    public void Qsort(int[] arr, int start, int end){

        if(end <= start){
            if(this.intermediateArrays.size() == 0){
                this.intermediateArrays.add(Arrays.copyOf(arr, arr.length));
            }
            return;
        }

        int pivot = partition(arr,start,end);
        Qsort(arr,start,pivot-1);
        Qsort(arr,pivot+1,end);
    }

    public int partition(int[] arr , int start, int end){

        int pivot = arr[end];
        int i = start-1;

        for(int j = start; j <= end ; j++){
            if(arr[j] < pivot){
                i++;
                if(i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    this.intermediateArrays.add(Arrays.copyOf(arr, arr.length));
                }
            }
        }

        i++;
        if(i != end) {
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;

            this.intermediateArrays.add(Arrays.copyOf(arr, arr.length));
        }

        return i;
    }

}