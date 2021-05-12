package com.IB;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IB_DuplicatesArray {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 1, 4, 1);
        System.out.println(repeatedNumber(list));

    }

    public static int repeatedNumber(final List<Integer> A){

        HashSet<Integer> set = new HashSet<>();

        for(int i :A){

            if(set.contains(i)){
                return i;
            }
            else {
                set.add(i);
            }
        }

        return A.size()+1;


    }
}
