package com.Hackerank;

import java.util.Scanner;

public class MoveAllZero {

    public static void main(String[] args) {
        int array[]=new int[5];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }

        pushZeroToEnd(array);
        printArray(array);
    }



    public static void pushZeroToEnd(int array[]) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] != 0) {
                array[count++] = array[i];
            }


        }
        while (count < array.length) {
            array[count++] = 0;
        }
    }
    public static void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
