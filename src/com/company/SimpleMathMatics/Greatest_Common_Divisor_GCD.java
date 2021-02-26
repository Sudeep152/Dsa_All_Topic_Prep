package com.company.SimpleMathMatics;

public class Greatest_Common_Divisor_GCD {
    public static  void  main(String  [] args){


        System.out.println(GCD_Naive_Approach(3, 9));
        System.out.println(GCD_Good_Approach(3,9));

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

}
