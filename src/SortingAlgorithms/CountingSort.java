package SortingAlgorithms;

import java.util.*;

public class CountingSort {

    public List<int[]> Sort(int [] list , Boolean steps){
        int min =list[0];
        int max =list[0];
        int [] finalArray=new int[list.length];
        List<int[]> intermediateArrays = new ArrayList<>();
        for(int i=0;i<list.length;i++){
            min=Math.min(min,list[i]);
            max=Math.max(max,list[i]);
        }

        int len=max-min+1;
        int [] prefixSum=new int[len];

        for(int i=0;i<list.length;i++){
         int index=list[i]-min;
         prefixSum[index]++;
        }

        for(int i=1;i<len;i++){
            prefixSum[i]=prefixSum[i]+prefixSum[i-1];
        }

        for(int i=list.length-1;i>=0;i--){
            int index = list[i] - min;
            int position = prefixSum[index] - 1;
            finalArray[position]=list[i];
            prefixSum[index]--;
            if (steps) {
                intermediateArrays.add(Arrays.copyOf(finalArray, finalArray.length));
            }
        }

        if (!steps){
            intermediateArrays.add(Arrays.copyOf(finalArray, finalArray.length));

        }

        return intermediateArrays;
    }
}
