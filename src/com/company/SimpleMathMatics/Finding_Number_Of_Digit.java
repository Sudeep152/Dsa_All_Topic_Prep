package com.company.SimpleMathMatics;

public class Finding_Number_Of_Digit {
    public static void main(String [] args){

        System.out.println(numberFind(0));
        System.out.println(numberLog(2145));


    }
    //Iterative Solution
    static int numberFind(int n){
        int count=0;
        while (n>0){

            count++;
            n=n/10;

        }
        return count;

    }
    //Logarithmic Solution

    static  int numberLog(int n){

        return (int) Math.floor(Math.log10(n)+1);

    }
}
