package com.company.Recursion.Return;

public class TowerOfHinoi {
    public static  void main(String  [] args){


        toh(3,'A','B','C');

    }
    static void  toh(int n,char A,char B,char C){

        if(n==0){
            return;
        }


        toh(n-1,A,C,B);
        System.out.println(n + " Move " + A + " to "+ B);
        toh(n-1,C,B,A);



    }
}
