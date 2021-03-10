package CSES;

import java.util.Scanner;

public class IncreasingNumber2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long n = sc.nextInt();
        long prev = sc.nextInt();
        long next;
        long steps = 0;

        while (--n>0){
           next = sc.nextInt();
           if(prev>next){
               steps = steps + (prev-next);
           }

           else{

               prev = next;
           }
        }
        System.out.println(steps);
    }
}
