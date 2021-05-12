package com.IB;

import java.util.ArrayList;
import java.util.Arrays;

public class FlipBug {

    public static void main(String[] args) {
        ArrayList<Integer> ret = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));

        System.out.println(rotateArray(ret,1));
    }

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < A.size()-1; i++) {
            ret.add(A.get(i + B));
        }
        return ret;
    }
}
