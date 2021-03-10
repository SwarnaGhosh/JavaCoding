

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BeautifulPermutations {
    public static void main(String[] args) throws IOException {


        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
        int n= Integer.parseInt(inp.readLine()); // for taking a number as an input
        int even;
        String  odd ="";

        if(n==1){
            System.out.println(1);
            return;
        }

        else if(n<4 && n>1 ){
            System.out.println("NO SOLUTION");
        }

       else if (n == 4) System.out.print( "3 1 4 2\n");

       else{
            for(int i =2;i<=n;i+=2){
                System.out.print(i+" ");
            }
            for (int i = 1; i <= n; i += 2) {
                System.out.print(i);;
                if (i < n - 1) System.out.print(" ");
                else{
                    return;
                }
            }
        }


    }


}

