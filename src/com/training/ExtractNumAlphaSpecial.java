package com.training;

import java.util.Scanner;

public class ExtractNumAlphaSpecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        extract(input);

    }
    private static void extract(String string){

        StringBuffer alpha=new StringBuffer(),num=new StringBuffer(),special= new StringBuffer();

        for (int i =0;i<string.length();i++){
            if(Character.isAlphabetic(string.charAt(i))){
                alpha.append(string.charAt(i));
            }
            else if (Character.isDigit(string.charAt(i))){
                num.append(string.charAt(i));
            }
            else{
                special.append(string.charAt(i));
            }
        }

        System.out.println(alpha);
        System.out.println(num);
        System.out.println(special);

    }

}
