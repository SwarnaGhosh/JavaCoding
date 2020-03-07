package com.IB;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class IB_SmallestTwo {

    public static void main(String args[]){
        ArrayList<Integer> al= new ArrayList<>();

        al.add(4);
        al.add(34);
        al.add(5);
        al.add(100);
        al.add(2);


        Collections.sort(al);

        System.out.println("2nd smallest number is:" + al.get(1));
        System.out.println("3rd Smallest number is:" + al.get(2));



    }
}
