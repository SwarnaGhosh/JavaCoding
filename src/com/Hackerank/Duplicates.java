package com.Hackerank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Duplicates {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(5);

        System.out.println("Duplicates elements are:" + duplicates(list));

    }


    public static List<Integer> duplicates(List<Integer> list) {

        List<Integer> result=new ArrayList<>();

        System.out.println(Collections.frequency(list,2));

        for(int i=0;i<list.size();i++){

            for (int j=i+1;j<list.size();j++){

                if (list.get(i)==list.get(j)){
                    result.add(list.get(j));
                    
                }
            }


        }
        return result;
    }

}