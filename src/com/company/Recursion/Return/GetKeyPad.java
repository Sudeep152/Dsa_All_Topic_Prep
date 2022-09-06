package com.company.Recursion.Return;

import java.util.ArrayList;
import java.util.List;

public class GetKeyPad {
    public static  void  main(String  [] args){

        ArrayList<String> keypadCOmbination = letterCombination("2");
        System.out.println(keypadCOmbination);


    }
    static String [] codes = {",.",",.","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static ArrayList<String> letterCombination(String str){


//        if(str.isEmpty()){
//            return  new ArrayList<>();
//        }


      if (str.length() ==0){

         ArrayList<String> lis= new ArrayList<>();
         lis.add("");
         return lis;

      }


        char firstChar= str.charAt(0);
        String smallString = str.substring(1);

        ArrayList<String> smallAns= letterCombination(smallString);
        ArrayList<String> Ans = new ArrayList<>();


        String codeString= codes[firstChar-'0'];

        for (char i =0;i<codeString.length();i++){
           char temp =codeString.charAt(i);
            for (String s: smallAns){
                Ans.add(temp+s);
            }

        }






        return Ans;


    }
}
