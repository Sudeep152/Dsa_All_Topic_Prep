package com.company.Recursion;

public class printNto1 {
    public static  void main(String [] args){


        function(5);

    }
    static void function(int n){

        if(n==0){
            return ;
        }

        System.out.println(n);
        function(n-1);




    }
}
