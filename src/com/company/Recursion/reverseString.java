package com.company.Recursion;

public class reverseString {
    public static  void main(String []  args){



        System.out.println(revrseString("Sudeep"));
    }

    static String revrseString(String  str){

        if (str.isEmpty()){
            return str;
        }

        return  revrseString(str.substring(1))+str.charAt(0);

    }
}
