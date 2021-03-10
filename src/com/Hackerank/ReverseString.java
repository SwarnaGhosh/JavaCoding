package com.Hackerank;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        reverseWhole(input);
        reverseIndividual(input);
        sameOrderreverse(input);

    }

    public static void  reverseWhole(String string){

        String word[]= string.split(" ");
        String reverse="";

        for(int i=word.length-1;i>=0;i--){

            reverse=reverse+" "+word[i];
        }
        System.out.println(reverse);

    }
    public static void reverseIndividual(String string){
        String word[]= string.split("");
        String reverse="";

        for(int i=word.length-1;i>=0;i--){

            reverse=reverse+word[i];
        }
        System.out.println(reverse);
    }

    public static void sameOrderreverse(String string){
        String word[]= string.split(" ");
        String reverse = "";
        for(int i =0;i<word.length;i++){

            String word1=word[i];
            String reverseword="";

            for(int j=word1.length()-1;j>=0;j--){
                reverseword = reverseword + word1.charAt(j);
            }
            reverse=reverse+reverseword+" ";
        }
        System.out.println(reverse);

    }
}
