package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {

        t("“i.like.this.program.very.much");

    }


//    static void prCharWithFreq(String s) {
//
//        Map<Character, Integer> d = new HashMap<Character, Integer>();
//
//        main();
//
//        for(int i = 0; i < s.length(); i++)
//        {
//            if(d.containsKey(s.charAt(i)))
//            {
//                d.put(s.charAt(i), d.get(s.charAt(i)) + 1);
//            }
//            else
//            {
//                d.put(s.charAt(i), 1);
//            }
//        }
//
//        for(int i = 0; i < s.length(); i++)
//        {
//            if(d.get(s.charAt(i)) != 0)
//            {
//                System.out.print(s.charAt(i));
//                System.out.print(d.get(s.charAt(i)) + " ");
//                d.put(s.charAt(i), 0);
//            }
//        }
//
//
//    }

    static  void  t(String str){

        String a=str;


        String[]arr=a.split("\\.");


        for(int i=0;i<=arr.length-1;i++){


            if(i%2==1)
                arr[i]="abc";

        }
        String rs="";


        for(int i=0;i<arr.length-1;i++){

            rs+=arr[i];

            rs+=".";
        }
        rs+=arr[arr.length-1];

        System.out.println(rs);

    }
}


