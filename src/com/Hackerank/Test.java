package com.Hackerank;

import java.util.*;

public class Test {

    public static void main(String[] args) {
    List<Integer> input=new ArrayList<>();
    int n=4;
    int round=0;


    input.add(33);
    input.add(45);
    input.add(67);
    input.add(72);


        System.out.println(input);
        System.out.println(input.get(1));

        String str="JAVA IS AWESOME";
        System.out.println(reverseOrder(str));
        String array[]=str.split(" ");
        System.out.println(array[1]);
        System.out.println(reverseIndividual("HOW ARE YOU"));
    }

    public static void hashMap(){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"ABC");
        map.put(2,"BCD");
        map.put(3,"CDM");
        map.put(4,"ERF");

       Set<Map.Entry<Integer,String>> entryset=map.entrySet();

       for (Map.Entry<Integer,String> entry:entryset){

           System.out.println(entry.getKey() + entry.getValue());
       }

    }

    public static String reverseOrder(String str){

        String string[]=str.split(" ");

        String reverse="";

        for(int i=string.length-1;i>=0;i--){
            reverse=reverse+string[i]+ " ";
        }
        return reverse;
    }

    public static String reverseIndividual(String str){

        String string[]=str.split(" ");
        int n=string.length;
        String reversestring="";


        for(int i=0;i<n;i++){

            String word=string[i];
            String reverseword="";

            for(int j=n-1;j>=0;j--){
                reverseword=reverseword+word.charAt(j);
            }

            reversestring=reversestring+reverseword+ " ";
        }


        return reversestring;
    }
}
