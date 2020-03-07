package com.IB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IB_spiral_2D {

    public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        if(matrix == null || matrix.size() == 0) return result;

        int m = matrix.size();          //row
        int n = matrix.get(0).size();   //column

        int x=0;
        int y=0;

        while(m>0 && n>0){

            //if one row/column left, no circle can be formed
            if(m==1){
                for(int i=0; i<n; i++){
                    result.add(matrix.get(x).get(y++));
                }
                break;
            }else if(n==1){
                for(int i=0; i<m; i++){
                    result.add(matrix.get(x++).get(y));
                }
                break;
            }

            //below, process a circle

            //top - move right
            for(int i=0;i<n-1;i++){
                result.add(matrix.get(x).get(y++));
            }

            //right - move down
            for(int i=0;i<m-1;i++){
                result.add(matrix.get(x++).get(y));
            }

            //bottom - move left
            for(int i=0;i<n-1;i++){
                result.add(matrix.get(x).get(y--));
            }

            //left - move up
            for(int i=0;i<m-1;i++){
                result.add(matrix.get(x--).get(y));
            }

            x++;
            y++;
            m=m-2;
            n=n-2;
        }

        return result;
    }

    public static void main(String args[]){
        List<ArrayList<Integer> > x
                = new ArrayList<ArrayList<Integer> >();

        x.add(new ArrayList<Integer>(Arrays.asList(2,5,4,10)));
        x.add(new ArrayList<Integer>(Arrays.asList(10,12,45,10)));
        x.add(new ArrayList<Integer>(Arrays.asList(23,45,67,98)));

        System.out.println(x.size());
        System.out.println(x.get(0).size());

        ArrayList<Integer> result=new ArrayList<Integer>();

        result=spiralOrder(x);

        System.out.println(result);

    }

    }

