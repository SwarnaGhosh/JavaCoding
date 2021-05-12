package com.IB;

import java.util.ArrayList;
import java.util.Scanner;

public class IB_FindPermutation {

    public static void main(String[] args) {

        String A = new Scanner(System.in).nextLine();
        int B = new Scanner(System.in).nextInt();

        System.out.println(findPerm(A,B));
    }


    public static ArrayList<Integer> findPerm(final String A, int B) {

        ArrayList<Integer> result = new ArrayList<>();

        int low = 1;
        int high = B;

        for(int i = 0;i<B-1;i++){

            char ch = A.charAt(i);

            if(ch == 'D'){
                result.add(high);
                high--;
            }

            if(ch =='I'){
                result.add(low);
                low++;
            }
        }

        result.add(low);

        return result;

    }
}