
package CSES;
import java.util.Scanner;

public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long even, odd;

        if (n == 1) {
            System.out.print(n+" ");
        }

        else {
            System.out.print(n+" ");
            while (n > 1) {
                if (n % 2 == 0) {

                    even = n / 2;
                    System.out.print(even+" ");
                    n = even;

                } else {
                    odd = n * 3 + 1;
                    System.out.print(odd+" ");
                    n = odd;
                }

            }
        }

    }
}
