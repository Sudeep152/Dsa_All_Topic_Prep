package com.company.Recursion;

import jdk.nashorn.internal.scripts.JO;

public class JoshephusProblem {
    public static void main(String []  args){

        ///Question
        //https://practice.geeksforgeeks.org/problems/josephus-problem/1/



        System.out.println(myjos(5,3));
    }

    static int myjos(int n ,int k){


        return JOH(n,k)+1;

    }

    static   int JOH(int n ,int k){

        if(n==1){
            return  0;
        }

        return( JOH(n-1,k)+k)%n;



    }
}
