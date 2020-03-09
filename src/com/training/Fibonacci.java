package com.training;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(9));
    }

    private static int fibonacci(int n){

        int a=4;
        int b=-5;

        System.out.println(a+b);

        if(n<1) {
            System.out.println("No terms");
        }
        else if(n==1||n==2){
            return n-1;
        }

        return (fibonacci(n-1)+fibonacci(n-2));


    }
}
