package com.IB;

import java.util.ArrayList;

public class IB_partitions {

    public static void main(String[] args) {

    }

    private static int Partitions(int A, ArrayList<Integer> B){


        int sum = 0;
        int array[] = new int[A];

        for(int i=0;i<A;i++){

            array[i]=sum;
            sum=sum+B.get(i);
        }

        if(sum%3 !=0){
            return 0;
        }

        int count =0;
        int singlesum = sum/3;
        int doublesum = (2*sum)/3;
        int ans =0;

        for(int i=1;i<A;i++){

           if(array[i]==doublesum){
               ans= ans+count;
           }

           if(array[i]==singlesum){
               count++;
           }
        }

        return ans;


    }
}
