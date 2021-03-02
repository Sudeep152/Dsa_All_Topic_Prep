package com.company.SimpleMathMatics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sieve_Of_Erotosthenes {
    public static void main(String []  args){


        SieveAlgoUse(18);

    }
    static Boolean primeN(int n){

        if (n==1)return false;
        if (n==2 || n==3 )return true;
        if (n%2==0 || n%3==0)return false;

        for (int i=5;i*i<=n;i=i+6){
            if (n%i==0 || n%(i+2)==0){
                return false;
            }

        }
        return true;

    }

    static void printNPrimeNaiveSolution(int n){

        for (int i =0;i<=n;i++){
            if (primeN(i)){
                System.out.println(i);
            }
        }
    }


    static void SieveAlgoUse(int n){

        if (n<=1)
            return;

        boolean isPrimeBro [] =new boolean[n+1];
        Arrays.fill(isPrimeBro,true);


        for (int i=2;i*i<=n;i++){

            if (isPrimeBro[i]){
                for (int j=2*i;j<=n;j=j+i){
                    isPrimeBro[j]=false;
                }
            }

        }
        for (int i=2;i<=n;i++){
            if (isPrimeBro[i])
                System.out.println(i);

        }
    }

}
