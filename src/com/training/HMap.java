package com.training;

import java.util.*;

public class HMap {

    public static void main(String[] args) {
        HashMap<String ,Integer> map = new HashMap<>();

        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("C",4);
        map.put("C",5);

        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



        for (Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }

        //-------------------------------------------//
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(3);

        Set<Integer> set = new HashSet<>(al);

        Iterator<Integer> iterator1 = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (int i :set){
            System.out.println(i);
        }

    }
}
