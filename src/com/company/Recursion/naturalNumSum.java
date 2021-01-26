package com.company.Recursion;

public class naturalNumSum {
    public static void main(String [] args){


        System.out.println(natural(5));

    }
    static int natural(int n){

        if (n==0){
            return 0;
        }

        return n+natural(n-1);
    }
}
