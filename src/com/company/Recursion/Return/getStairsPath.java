package com.company.Recursion.Return;

import java.util.ArrayList;
import java.util.List;

public class getStairsPath {
    public static void main(String [] args){


        List<String> aar= getNumber(4);

        System.out.println(aar);




    }
    static List<String> getNumber(int n){

        if(n==0){
            List<String>list= new ArrayList<>();
            list.add("");
            return list;
        }else if(n<0){
            return new ArrayList<>();
        }


        List<String>path1= getNumber(n-1);
        List<String>path2= getNumber(n-2);
        List<String>path3= getNumber(n-3);


        List<String> Answer= new ArrayList<>();



        for (String pa:path1){
            Answer.add(1+pa);
        }
        for(String pa:path2){
            Answer.add(2+pa);
        }
        for (String pa:path3){
            Answer.add(3+pa);
        }



        return Answer;



    }
    static void  printStairsPath(int n,String ans){

        if(n <0){
            return;
        }
        if(n==0){
            System.out.println(ans);
            return;
        }

        printStairsPath(n-1,ans +"1");
        printStairsPath(n-2,ans +"2");
        printStairsPath(n-3,ans +"3");

    }
}
