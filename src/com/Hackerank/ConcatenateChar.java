package com.Hackerank;

import java.util.Scanner;

public class ConcatenateChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int array[]=new int [n];
        int length=array.length;
        int sum =0;
        for (int i=0;i<length;i++){
            array[i]=s.nextInt();
        }

        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){

                if(i!=j){

                     sum=array[i]+array[j];


                }
                if(sum % 2 !=0){
                    System.out.println("Odd sum present");
                }

            }
        }
    }
}
