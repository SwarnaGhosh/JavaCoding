package com.IB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IB_FindAllDuplicates {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,5,5,3,4);
        System.out.println(repeatedNumber(list));
    }

    private static ArrayList<Integer> repeatedNumber(final List<Integer> A){

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i :A){

            if(set.contains(i)){
                result.add(i);
            }

            else{
                set.add(i);
            }
        }

        return result;


    }
}
