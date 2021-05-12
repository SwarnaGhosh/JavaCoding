package com.IB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddOneToNumber2 {

    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int num=0;
        int reminder = 0;

        while (A.size()>1&&A.get(0)==0){
            A.remove(0);
        }
        for (int i =A.size()-1;i>=0;i--){
            num = A.get(i);


            if(num==9){
                A.remove(i);
                A.add(i,0);
                reminder=1;
            }

            else{
                A.remove(i);
                A.add(i,num+1);
                reminder = 0;
                break;
            }

        }
        if(reminder==1){
            A.add(0,1);
        }


        return A;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(2,3,4,5));

        System.out.println(plusOne(arrayList));
    }


}
