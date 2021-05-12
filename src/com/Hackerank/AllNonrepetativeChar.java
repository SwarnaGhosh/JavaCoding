package com.Hackerank;

import java.util.*;

public class AllNonrepetativeChar {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(allRepetiveCharacter(str));
    }

    public static String allRepetiveCharacter(String str){

        String[] chararray=str.split("");

        Set<String> set=new LinkedHashSet<>();
        int count =1;

        for(String s:chararray){
            if(set.contains(s)){
                count++;
                if(count>1){
                    set.remove(s);
                }
            }
            else{
                set.add(s);
            }

        }


        if (set.contains(" ")){
            set.remove(" ");
        }

        return String.valueOf(set);

    }
}
