package com.IB;

import java.util.ArrayList;
import java.util.Arrays;

public class IB_MinimumSteps {
    public static int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int currentX = X.get(0);
        int currentY = Y.get(0);
        int count = 0;

        for (int i=1;i<X.size();i++) {
            int x = X.get(i);
            int y = Y.get(i);

             count=count+ Math.max(Math.abs(y-currentY), Math.abs(x-currentX));
            currentY = y;
            currentX = x;
        }
        return count;
    }

    public static void main(String args[]){
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(5,10));

        ArrayList<Integer> B=new ArrayList<>(Arrays.asList(10,5));

        int steps=coverPoints(A,B);
        System.out.println(steps);

    }
}
