package com.company.SimpleMathMatics;

import java.util.Scanner;

public class Greatest_Common_Divisor_GCD {
    public static  void  main(String  [] args){

        Scanner scanner=new Scanner(System.in);
       int a =scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println(GCD_Naive_Approach(a, b));
        System.out.println(GCD_Good_Approach(a,b));


    }

    ///First Naive Approach

    static  int GCD_Naive_Approach(int  a,int b){

        int res= Math.min(a,b);

        while ( res>0){

            if( a%res==0 && b%res==0){
                break;
            }

            res--;
        }
        return res;


    }
    ///Euclidean Algorithm
    //Basic

    static  int GCD_Good_Approach(int a,int b){

        while (a!=b){

            if(a>b){
                a=a-b;
            }else {
                b=b-a;
            }
        }
        return a;
    }

    //Advance Method
 int GCD_ADVANCE_Approach(int a,int b){
        if (b==0){
            return a;
        }
        return GCD_ADVANCE_Approach(b,a%b);
    }
}
