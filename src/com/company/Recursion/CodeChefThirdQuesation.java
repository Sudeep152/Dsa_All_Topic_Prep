package com.company.Recursion;

import java.util.Scanner;

public class CodeChefThirdQuesation {
    public static void main(String [] args){


        fun();
    }
    static void fun(){

        Scanner scanner=new Scanner(System.in);

        int T=scanner.nextInt();
        System.out.println("Hr");
        String HH=scanner.next();
        String Min=scanner.next();
        String s=HH +":"+Min;
        System.out.println(s);

        while (T-->0){

             int n =scanner.nextInt();

             for (int i=0;i<n;i++){
                 String HHForL=scanner.next();
                 String MinForM=scanner.next();
                 String meetTime=HHForL +":"+MinForM;
                 System.out.println(meetTime);
             }




        }




    }

}
