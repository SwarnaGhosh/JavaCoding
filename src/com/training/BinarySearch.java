package com.training;

public class BinarySearch {

    private static int binarySearch(int array[],int lower,int higher,int element){

        if(higher>1){
            int mid=(lower+(higher-1))/2;

            if(array[mid]==element){
                return mid;
            }
            else{
                if(array[mid]>element){
                    return binarySearch(array,lower,mid-1,element);
                }
                else{
                    return binarySearch(array,mid+1,higher,element);
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int array[]={2,3,56,43,67,100};
        int length=array.length;
        int element=47;

        int result=binarySearch(array,0,length-1,element);

        if (result==-1){
            System.out.println("Not Found");
        }
        else {
            System.out.println("Found in position"  +result);
        }
    }
}
