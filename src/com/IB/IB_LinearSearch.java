package com.IB;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class IB_LinearSearch {
    public static void main (String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();


        int number=sc.nextInt();


        String input = sc.nextLine();
        String[] numbersStr = input.split(" ");


        int[] numbers = new int[ numbersStr.length ];
        for ( int i = 0; i < numbersStr.length; i++ )
        {
            numbers[i] = Integer.parseInt( numbersStr[i] );
        }

        int result=linearSearch(numbers,number);
        System.out.println(result);
    }

    private static int linearSearch(int array[],int number){

        int n=array.length;

        for(int i=0;i<n;i++){

            if(array[i]==number){
                return i+1;
            }
        }
        return -1;
    }
}