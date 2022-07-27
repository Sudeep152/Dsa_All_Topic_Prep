package com.company.String;

import java.awt.*;
import java.util.Arrays;

public class CheckAnagram {
    public  static  void  main(String [] args){

        String s1 = "listen";
        String s2 = "silen";
        System.out.println(NaiveSol(s1,s2));
        System.out.println(EfficientSolution(s1,s2));
    }
    static boolean NaiveSol(String s1, String s2){

        char [] s1Sort = s1.toCharArray();
        Arrays.sort(s1Sort);
        s1 = new String(s1Sort);

        char [] s2Sort = s2.toCharArray();
        Arrays.sort(s2Sort);
        s2= new String(s2Sort);

       return s1.equals(s2);

    }
    static boolean EfficientSolution(String str1 , String str2 ){

        int [] count = new int[256];
        if (str1.length() != str2.length()){
            return false;
        }

        for (int i =0;i< str1.length();i++){

            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;



        }
        for (int i =0;i<count.length;i++){
            if (count[i] !=0){
                return false;
            }
        }
        return true;




    }
}
