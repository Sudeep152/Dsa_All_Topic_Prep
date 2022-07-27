package com.company.String;

public class ReverseWordInAString {
    public static void main(String [] args){

        String str ="Hell my name";
        naiveApproach(str);

    }
    static void  naiveApproach(String  str){

        int  n = str.length();

        String temp = new String();

        for (int i=n-1;i>=0;i--){

            if (str.charAt(i) ==' '){
                temp.charAt(i);
            }


        }

        System.out.println(temp);


    }
}
