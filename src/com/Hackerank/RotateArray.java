package com.Hackerank;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {

        int array[]=new int [4];
        int n=array.length;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            array[i]=sc.nextInt();
        }

        leftrotate(array,n,1);
        printArray(array,n);


    }
    public static void leftrotate(int array[],int n,int d){
        for (int i = 0; i < d; i++)
            rotationArray(array, n);
    }

    public static void rotationArray(int array[],int n){
        int temp=0;
        int i;
        temp=array[0];

        for(i=0;i<n-1;i++){
            array[i]=array[i+1];
        }
        array[i]=temp;





    }

    public static void printArray(int array[],int n){

        for(int i =0;i<n;i++){

            System.out.println( + array[i]);
        }
    }
}
