package com.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class Collections {

    public static LinkedHashSet<Integer> set;
    public static ArrayList<Integer> list=new ArrayList<Integer>();

    public static void main(String[] args) {
        list.add(23);
        list.add(45);
        list.add(2);
        list.removeIf(num ->num%2==0);
        ListIterator iterator=list.listIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        removeDuplicates();

    }

    public static void removeDuplicates(){
        list.add(34);
        list.add(43);
        list.add(34);
        list.add(45);

        set=new LinkedHashSet<>(list);

        System.out.println(set);
    }
}
