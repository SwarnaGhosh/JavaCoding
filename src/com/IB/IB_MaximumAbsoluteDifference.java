package com.IB;

import java.util.ArrayList;

public class IB_MaximumAbsoluteDifference {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
       // arrayList.add(0);
      //  arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(5);

        System.out.println(maxArr(arrayList));
    }

    public static int maxArr(ArrayList<Integer> A){
        int maxSums=A.get(0);
        int minSums=A.get(0);
        for(int i=0;i<A.size();i++)
        {
            maxSums=Math.max(maxSums,A.get(i)+i);
            minSums=Math.min(minSums,A.get(i)+i);
        }
        int sumsRes=maxSums-minSums;
        int maxDif=A.get(0);
        int minDif=A.get(0);
        for(int i=0;i<A.size();i++)
        {
            maxDif=Math.max(maxDif,A.get(i)-i);
            minDif=Math.min(minDif,A.get(i)-i);
        }
        int difsRes=maxDif-minDif;
        return Math.max(difsRes,sumsRes);
    }
    }

