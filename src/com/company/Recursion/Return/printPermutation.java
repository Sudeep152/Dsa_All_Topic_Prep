package com.company.Recursion.Return;

public class printPermutation {
    public static void main(String [] args){

        printAllPermutation("Sahsahnk","");

    }
    static void printAllPermutation(String str,String ans){

        if (str.length()==0){
            System.out.println(ans);
            return;
        }

        for (int i=0;i<str.length();i++){
            char f = str.charAt(i);

            String leftPart = str.substring(0,i);
            String rightPart=str.substring(i+1);
            String merge= leftPart+rightPart;
            printAllPermutation(merge,ans+f);


        }




    }
}
