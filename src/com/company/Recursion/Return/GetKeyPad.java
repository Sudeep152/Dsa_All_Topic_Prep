package com.company.Recursion.Return;

import java.util.ArrayList;
import java.util.List;

public class GetKeyPad {
    public static  void  main(String  [] args){

        ArrayList<String> keypadCOmbination = letterCombination("33");
        System.out.println(keypadCOmbination);


    }
    static String [] codes = {",.",",.","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};


    static ArrayList<String> letterCombination(String str){

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


    static void  getKeyPad(String question,String ans){


        if(question.length()==0){
            System.out.println(ans);
            return;
        }

        char ch= question.charAt(0);
        String smallQu = question.substring(1);

        String codeIndexArray = codes[ch -'0'];

        for(int i =0; i<codeIndexArray.length();i++){
            char opt = codeIndexArray.charAt(i);
            getKeyPad(smallQu,ans + opt);
        }
    }
}
