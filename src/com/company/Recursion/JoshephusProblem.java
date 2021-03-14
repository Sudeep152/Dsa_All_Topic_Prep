package com.company.Recursion;

import jdk.nashorn.internal.scripts.JO;

public class JoshephusProblem {
    public static void main(String []  args){

        System.out.println(JOH(6,3));
    }
    static   int JOH(int n ,int k){

        if(n==1){
            return  0;
        }

        return( JOH(n-1,k)+k)%n;



    }
}
