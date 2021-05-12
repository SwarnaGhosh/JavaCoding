package com.Hackerank;

import java.util.Scanner;

public class NonRepetiveCharacter {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(nonRepetiveCharacter(str));
    }

    public static String nonRepetiveCharacter(String str){

        String result="";
        boolean flag;

        for(int i =0;i<str.length();i++){

            flag = true;
            for (int j =0;j<str.length();j++){
                if(i!=j&&str.charAt(i)==str.charAt(j)){

                    flag = false;
                    break;
                }
            }
            if(flag){
                result=String.valueOf(str.charAt(i));
                break;
            }

        }

        return result;
    }
}
