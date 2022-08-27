package com.company;


import java.util.*;

public class Practice {
    public static void main(String[] args) {




    }
    static String toLowerCase(String s) {

        int n = s.length();
        StringBuffer newStr=new StringBuffer(s);

        for(int i =0 ; i< n ;i++){

            char r = s.charAt(i);

            if (Character.isUpperCase(r)){
                newStr.setCharAt(i, Character.toLowerCase(s.charAt(i)));
            }


        }

        return newStr.toString();

    }
}
