package com.company.HashmapAndHeap;
import  java.util.*;

public class Basic {
    public static void main(String [] args){



        HashMap<String,Integer> map = new HashMap<>();

        map.put("India",130);
        map.put("China",200);
        map.put("Pakistan",110);
        map.put("Us",30);
        map.put("UK",10);


        System.out.print(map);

        Set<String>  key= map.keySet();

        System.out.println(key);

        System.out.println();

        //Looping in HashMap;

        for (String kNumber :map.keySet() ){

            Integer val = map.get(kNumber);
            System.out.println(kNumber + " " + val );

        }

    }
}
