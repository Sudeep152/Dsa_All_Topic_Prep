package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

       System.out.println(advance_eculiden_Gcd(4,6));

    }
    static  int revNumber(int n){
        int rev=0;
        int rem=0;
        while (n>0){
            rev = n%10;
            rem= rem*10+rev;
            n=n/10;
        }
        return rem;
    }

    static int countdig(int n){
        int count=0;

        while (n>0){

            count++;
            n=n/10;

        }
        return count;
    }

    static int factorial(int n){
        int fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    static  int trailingZero(int n){
        int count=0;
        for (int i=5;i<=n;i=i*5){

            count=count+ n/i;
        }

  return count;
    }


    static  int Naive_GCD(int a,int b){

        int min = Math.min(a,b);

        while (min % a==0 || min %b==0){
            break;
        }
        return min;
    }

    static int eculidean_GCD(int a,int b){

        while (a!=b){

            if(a>b){
                a=a-b;
            }else {
                b=b-a;
            }


        }
        return a;

    }


    static  int advance_eculiden_Gcd(int a,int b){

        if(b==0){
            return  a;
        }

        return advance_eculiden_Gcd(b,a%b);
    }

    static int LCM (int a,int b){

        return a;
    }


    }


