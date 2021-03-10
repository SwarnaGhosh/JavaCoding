package com.IB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IB_MaxumumSubArray {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(2);

        System.out.println(kadane(arrayList));
    }

    public static int kadane(List<Integer> A)
    {
        int array[] = new int[A.size()];
        for (int i =0; i < A.size(); i++){
            array[i] = A.get(i);
        }

        // find maximum element present in given array
        int max = Arrays.stream(array).max().getAsInt();

        // if array contains all negative values, return maximum element
        if (max < 0) {
            return max;
        }

        // stores maximum sum sub-array found so far
        int maxSoFar = 0;

        // stores maximum sum of sub-array ending at current position
        int maxEndingHere = 0;

        // do for each element of the given array
        for (int i: A)
        {
            // update maximum sum of sub-array "ending" at index i (by adding
            // current element to maximum sum ending at previous index i-1)
            maxEndingHere = maxEndingHere + i;

            // if maximum sum is negative, set it to 0 (which represents
            // an empty sub-array)
            maxEndingHere = Integer.max(maxEndingHere, 0);

            // update result if current sub-array sum is found to be greater
            maxSoFar = Integer.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}
