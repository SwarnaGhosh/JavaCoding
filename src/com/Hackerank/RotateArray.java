package com.Hackerank;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {

        int array[]=new int [3];
        int n=array.length;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            array[i]=sc.nextInt();
        }



        System.out.println("--------------------------------------------------------------------------------");

       // rightrotate(array,n,1);
        leftrotate(array,n,2);
        printArray(array,n);


    }
    public static void leftrotate(int array[],int n,int d){
        for (int i = 0; i < d; i++)
            rotationArray(array, n);
    }

    public static void rightrotate(int array[],int n,int d){
        for (int i = 0; i < d; i++)
           rightRotate(array, n);
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

    public static void rightRotate(int array[],int n){

        int j, last;
        //Stores the last element of array
        last = array[array.length-1];

        for(j = array.length-1; j > 0; j--){
            //Shift element of array by one
            array[j] = array[j-1];
        }
        //Last element of array will be added to the start of array.
        array[0] = last;

    }

    public static void printArray(int array[],int n){

        for(int i =0;i<n;i++){

            System.out.println( + array[i]);
        }
    }
}
