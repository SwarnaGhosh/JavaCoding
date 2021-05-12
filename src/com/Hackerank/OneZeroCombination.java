package com.Hackerank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OneZeroCombination {

    public static void main(String[] args) {

        System.out.println(getStringLength("111*000"));

    }

    private static int getStringLength(String str){

        String[] array= str.split("");
        List<String> al = new ArrayList<>(Arrays.asList(array));


        for(int k =0;k<str.length();k++){

            for(int i=0;i<al.size()-1;i++){
                if((al.get(i).equalsIgnoreCase("0")&&al.get(i+1).equalsIgnoreCase("1"))||(al.get(i).equalsIgnoreCase("1")
                        &&al.get(i+1).equalsIgnoreCase("0"))){
                    al.remove(i+1);
                    al.remove(i);

                }


            }




        }

        return al.size();


    }

}
