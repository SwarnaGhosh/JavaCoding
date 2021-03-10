package com.IB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class IB_MissingNumberArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(3);
        System.out.println(repeatedNumber(arrayList));

    }

    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> out = new ArrayList<Integer>();
        double l = A.size();
        double sum = (l*(l+1))/2;
        long sumA = 0;
        int a=0;
        HashSet<Integer> ASet = new HashSet<Integer>();
        for(int i=0;i<A.size();i++) {
            if(ASet.contains(A.get(i))) {
                a=A.get(i);
            }
            ASet.add(A.get(i));
            sumA = sumA+A.get(i);
        }
        double diff = sumA - sum;
        int b = a - (int)diff;
        out.add(a);
        out.add(b);
        return out;
    }
}