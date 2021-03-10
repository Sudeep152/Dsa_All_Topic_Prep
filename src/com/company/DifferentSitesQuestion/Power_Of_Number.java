package com.company.DifferentSitesQuestion;

public class Power_Of_Number {
    public static  void main(String [] args){


        System.out.println( power(361,163));

    }
    static long power(int N,int R)
    {
        //Your code here
        if(R==0){
            return 1;
        }
        if(R==1){
            return N;
        }

        if(N%2==1){

            return  power(N,R/2)*power(N,R/2) *N;

        }

        return power(N,R/2)*power(N,R/2);


    }
}
