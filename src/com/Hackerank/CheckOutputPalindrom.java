package com.Hackerank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CheckOutputPalindrom {

    public static void main(String[] args) throws IOException {

        int n = new Scanner(System.in).nextInt();
        ArrayList<Integer> al =new ArrayList<Integer>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine(); // to read multiple integers line
        String[] strs = line.trim().split("\\s+");
        for (int i = 0; i < n; i++) {
            al.add(i,Integer.parseInt(strs[i]));
        }


        Collections.sort(al);

        System.out.println(al.get(0));


    }
}
