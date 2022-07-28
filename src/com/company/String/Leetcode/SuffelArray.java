package com.company.String.Leetcode;

public class SuffelArray {

     public static  void main(String [] args){

         String s = "codeleet";
         int [] ar = {4,5,6,7,0,2,1,3};
    System.out.print(restoreString(s,ar));


     }
     static String restoreString(String s, int[] indices) {

         int numberStringELe = s.length();

         char [] chars = new char[numberStringELe];


         for(int i =0;i<indices.length;i++){
            chars[indices[i]]= s.charAt(i);
         }

         return String.valueOf(chars);




     }
}
