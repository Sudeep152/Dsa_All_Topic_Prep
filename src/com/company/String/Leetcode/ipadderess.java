package com.company.String.Leetcode;

public class ipadderess {
    public static  void main(String [] args){

        String add ="1.1.1.1";
        System.out.println(defangIPaddr(add));

    }
    static String defangIPaddr(String address) {



        return   address.replace(".","[.]");

    }
}
