package com.Hackerank;

public class Palindrome {
    public static void main(String[] args) {
        int num=123;
        int original=num;
        int reverse=0;
        int reminder;
        while(num!=0){
            num=num/10;
            reminder =num%10;
            reverse=reminder*10+reminder;
        }
        if(original==reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }



    }
}
