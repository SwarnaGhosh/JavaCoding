package com.Hackerank;

public class ReverseArrayGroup {

    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6};
        int n=array.length;
        int k=3;
        System.out.println("Final array will be:");
        reverseGroup(array,n,k);
        printAray(array);

    }

    public static void reverseGroup(int array[],int n,int k){


        for(int i=0;i<n;i+=k){

            int left=i;
            int right=Math.min(i+k-1,n-1);
            int temp=0;

            while (left<right){
                temp=array[left];
                array[left]=array[right];
                array[right]=temp;
                left+=1;
                right-=1;

            }
        }





    }
    public static void printAray(int array[]){
        int n=array.length;

        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
    }

}
