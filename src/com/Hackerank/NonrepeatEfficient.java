package com.Hackerank;

import java.util.*;

public class NonrepeatEfficient {

    public static void main(String[] args) {
        String str = "SWARNA GHOSH";
        String result="";

        Map<Character,Integer> map = new LinkedHashMap<>();

        for(int i =0;i<str.length();i++){

            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }

            else{
                map.put(str.charAt(i),1);
            }
        }

        System.out.println();

        char index='\0';
        boolean flag =true;



       for(Map.Entry<Character,Integer> entry: map.entrySet()){

           if(entry.getValue()==1){

               index=entry.getKey();
               flag = false;
               break;

           }


       }

       if (flag==false){
           System.out.println(index);
       }
       else {
           System.out.println("-1");
       }

    }
}
