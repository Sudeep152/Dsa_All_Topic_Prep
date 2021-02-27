package com.company.SimpleMathMatics;

public class Least_Common_Multiply {
    public static void  main(String [] args){

System.out.println(LCM_Naive_Solution(72,120));


    }
    static  int LCM_Naive_Solution(int a,int b){

        Greatest_Common_Divisor_GCD gcd=new Greatest_Common_Divisor_GCD();

       int n= gcd.GCD_ADVANCE_Approach(a,b);

        return  a*b/n;

    }

}
