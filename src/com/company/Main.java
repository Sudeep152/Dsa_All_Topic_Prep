package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {


        System.out.println(prime(5));

        System.out.println();


    }
    public static boolean prime(int n){

        //Write your code here
        //returns a boolean value

        if(n==1){
            return false;
        }
        if(n==2  || n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }

        for(int i=5;i<=n;i=i*5){

            if(n%i == 0 || n%(i+2)==0){
                return false;
            }
            return true;
        }

        return true;
    }


    }


