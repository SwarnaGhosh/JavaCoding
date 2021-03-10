
package CSES;
import java.util.Scanner;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long array[]=new long [n];
        long seriessum = 0;
        long sum =0;
        seriessum = (n*(n+1))/2;


        for (int i=0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }

        if (n == 1){
            return ;
        }

        else{
            for(int i = 0; i<array.length;i++){
               sum = Math.abs(sum) + Math.abs(array[i]);
            }
            long missingnum = Math.abs(seriessum) - Math.abs(sum) ;
            System.out.println(missingnum);
        }
    }
}
