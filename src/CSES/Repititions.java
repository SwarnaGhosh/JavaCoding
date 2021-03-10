package CSES;

import java.util.Scanner;

public class Repititions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int length = str.length();
        int count=1;
        int max =0;

        for(int i=1;i<length;i++){

            if(str.charAt(i)!=str.charAt(i-1) ){

                max =Math.max(max,count);
                count =0;
            }
            count ++;

        }

        max=Math.max(max,count);
        System.out.println(max);


    }
}
