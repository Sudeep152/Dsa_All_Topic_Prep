package com.company.Recursion.Return;

public class PrintSubsequence {
    public static void main(String  [] args){

        printSS("abcdefghijklmnopqrstuvwxyz","");
    }
    static void printSS(String str ,String ans){

        if (str.length()==0){
            System.out.println(ans);
            return;
        }

        char c = str.charAt(0);
        String sP = str.substring(1);

        printSS(sP,ans+ c);
        printSS(sP,ans+ "_");


    }
}
