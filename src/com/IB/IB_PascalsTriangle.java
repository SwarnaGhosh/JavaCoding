package com.IB;
import java.util.ArrayList;

public class IB_PascalsTriangle {

    public static ArrayList<ArrayList<Integer>> generate(int A){

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i < A; i++) {
            list.add(new ArrayList<>());
            for (int j = 0; j <= i; j++) {
                if(j == i || j == 0) {
                    list.get(i).add(1);
                } else {
                    list.get(i).add(list.get(i-1).get(j) + list.get(i-1).get(j-1));
                }
            }
        }
        return list;
    }
   

    public static void main(String[] args) {
        int n =3;
        System.out.println(generate(n));

    }
}
