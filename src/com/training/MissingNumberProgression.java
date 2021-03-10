package com.training;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumberProgression {

    public static void main(String[] args) {

         int number=solution("-H-H");
         System.out.println(number);

    }


    public static int solution(String S) {
        // write your code in Java SE 8


        int count = 0;
        int n = S.length();

        if (n == 1) {
            return -1;
        } else {

            if (S.charAt(0) == 'H' && S.charAt(1) == 'H') {
                return -1;
            } else if (S.charAt(n - 2) == 'H' && S.charAt(n - 1) == 'H') {
                return -1;
            } else {

                for (int i = 0; i <n-2; i++) {

                    if(S.charAt(i)=='H'&&S.charAt(i+1)=='-'&&S.charAt(i+2)=='H'){
                        count++;
                    }
                }
            }

        }
       return count;
    }
}





