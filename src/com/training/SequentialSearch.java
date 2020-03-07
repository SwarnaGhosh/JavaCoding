package com.training;

public class SequentialSearch {

    private static int linearSearch(int array[],int n){

        int length=array.length;
        for(int i=0;i<=length-1;i++){
            if(array[i]==n){
                return i;
            }
        }
        return -1;

    }

    public static void main(String args[]){
        int array[]={2,3,50,10,4,55};
        int x=10;

        int output=linearSearch(array,x);

        if(output==-1){
            System.out.println("Element is not present in the array");
        }
        else {
            System.out.println("Element is present in the array" + output);
        }
    }
}
