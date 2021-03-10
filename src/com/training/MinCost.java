package com.training;

public class MinCost {
    public static void main(String[] args) {

        int array[] ={1,2,1,2,1,2};

       int cost = Solution("aabbcc",array);
        System.out.println(cost);
    }

    public static int Solution(String S, int[] C){

        int mincost = 0;
        int i = 0;

        while(i<S.length()-1){

            if(S.charAt(i)==S.charAt(i+1)){

                if(C[i]<C[i+1]){

                    mincost = mincost+C[i];

                }
                else
                {
                    mincost =mincost+ C[i+1];
                    C[i+1]=C[i];
                }


            }
            i++;

        }
     return mincost;
    }
}
