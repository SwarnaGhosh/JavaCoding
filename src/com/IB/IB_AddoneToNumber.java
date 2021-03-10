package com.IB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IB_AddoneToNumber {
    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int sum =0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int length = A.size();
        A.set(length - 1, A.get(length - 1) + 1);
        int carry = A.get(length - 1) / 10;
        A.set(length - 1, A.get(length - 1) % 10);


        for (int i = length - 2; i >= 0; i--)
        {
            if (carry == 1)
            {
                A.set(i, A.get(i) + 1);
                carry = A.get(i) / 10;
                A.set(i, A.get(i) % 10);
            }
        }
        while(A.get(0)==0 && carry !=1){
            A.remove(0);
        }

        if (carry == 1)
            A.add(0, 1);

        return A;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(2);

        System.out.println(plusOne(arrayList));
    }
}
