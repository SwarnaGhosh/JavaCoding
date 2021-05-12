package com.IB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        int max_so_far = 0;
        int max_ending_here = 0;

        int max = Collections.max(A);
        if(max<0){
            return max;
        }


        for(int i=0;i<A.size();i++){

            max_ending_here = max_ending_here + A.get(i);



            if(max_ending_here<0){


                max_ending_here =0;
            }
            else if(max_so_far<max_ending_here){
                max_so_far=max_ending_here;
            }


        }
        return max_so_far;


    }
}
