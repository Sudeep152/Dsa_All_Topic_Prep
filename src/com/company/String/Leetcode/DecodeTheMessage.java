package com.company.String.Leetcode;

import java.util.HashMap;
import java.util.Hashtable;

public class DecodeTheMessage {
public  static  void main(String [] args){

    decodeMessage("the quick brown fox jumps over the lazy dog","sdfsdddsf");

}
   static void decodeMessage(String key, String message) {



    key=key.replaceAll("\\s","");



       HashMap<Character,Character> Decoder = new HashMap<>();

       for (int i=0 ;i<26;i++){

          Decoder.put((char) (96+i),key.charAt(i));


          // System.out.println(key.charAt(i));
       }


       System.out.println(Decoder);


    }
}


