package com.company.Recursion.Return;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class StringSubsequence {
    public static  void main(String [] args){




        System.out.println(  gss("abcdefghijklmnopqrstuvwxyz"));



    }

    static ArrayList<String> gss(String str){

        if (str.length()==0){
            ArrayList<String> res= new ArrayList<>();
            res.add("");
            return res;
        }

        char temp = str.charAt(0);
        String ros=str.substring(1);

        ArrayList<String> shortAns= gss(ros);
        ArrayList<String> realAns = new ArrayList<>();
        for (String i : shortAns){
            realAns.add(""+i);
        }
        for (String i : shortAns){
            realAns.add(temp+""+i);
        }


        return realAns;



    }

}
