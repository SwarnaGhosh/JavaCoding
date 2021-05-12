package com.Hackerank;

import java.util.Scanner;

public class StarPattern {

    public static void main(String[] args) {

        char ch ='*';

        int n = new Scanner(System.in).nextInt();

        for(int i =1;i<=n;i++){
            int j =1;
            while(j<=i){
                System.out.print(ch);
                j++;
            }

            System.out.println();

        }

        inverseTrianglePatter(n);
        System.out.println("--------------------");
        pyramid(n);
        System.out.println("--------------------");
        mirrorRightAngle(n);
        System.out.println("--------------------");
        mirrorinverseRightAngle(n);
    }

    private static void inverseTrianglePatter(int n){


        char ch ='*';


        for(int i =1;i<=n;i++){

            for(int j =n-1;j>=i;j--){

                System.out.print(ch);
            }
            System.out.println();

        }




    }

    private static void pyramid(int n) {


        for (int i = 1; i <= n; i++) {

            for (int j = n - 1; j >= i; j--) {

                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {

                System.out.print(" *");
            }

            System.out.println();
        }

    }

    private static void mirrorRightAngle(int n){


        for (int i =1;i<=n;i++){

            for(int k =n-1;k>=i;k--){

                System.out.print(" ");

            }
            for(int j =1;j<=i;j++){

                System.out.print("*");
            }
            System.out.println();



        }

    }

    private static void mirrorinverseRightAngle(int n){



      for(int i =0;i<=n;i++){

          for(int j =1;j<=i;j++){
              System.out.print(" ");
          }
          for (int k =n-1;k>=i;k--){
              System.out.print("*");
          }

          System.out.println();

      }




    }
    }




