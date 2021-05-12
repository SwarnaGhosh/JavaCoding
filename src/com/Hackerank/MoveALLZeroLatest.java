package com.Hackerank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MoveALLZeroLatest {

    public static void main(String[] args) {

        int array[] = new int[5];

        for (int i =0;i<array.length;i++){
            array[i]=new Scanner(System.in).nextInt();
        }

        List<Integer> al = new LinkedList<>();

        for(int i =0;i<array.length;i++){
            al.add(i,0);
        }

        for(int k =0;k<array.length;k++){

            if(array[k]!=0){

                al.add(array[k]);
            }
        }

        System.out.println(al);
    }
}