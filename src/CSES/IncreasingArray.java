
package CSES;
import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long array[] = new long[n];
        long temp = 0;
        long count = 1;
        for(int i =0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }

        for(int i =0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    count++;
                }

            }
        }
        for(int i =0;i<n;i++){
            System.out.println(array[i]);
        }
        System.out.println(count);
    }




}
