package com.IB;

import java.util.ArrayList;
import java.util.Arrays;

public class IB_NextPermutations {

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(nextPermutation(A));


    }

    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> A){
        int n = A.size();

        ArrayList<Integer> al1 = new ArrayList<>();

        for(int i =n-1;i>0;i--){
            int num = A.get(i);
            if(num>A.get(i-1)){
                A.add(i,A.get(i-1));
                A.add(i-1,num);
            }



        }
        return A;
    }




}
