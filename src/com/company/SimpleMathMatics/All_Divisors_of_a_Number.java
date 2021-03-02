package com.company.SimpleMathMatics;

public class All_Divisors_of_a_Number {
    public static void main(String [] args){

        //number(7);
        //advanceMethod(14);
        advanceMethod_Sorted_Order(15);

    }
    static void number(int n){

        for (int i=1;i<=n;i++){

            if(n%i==0){
                System.out.println(i);
            }
        }

    }
    static void advanceMethod(int n){
        for (int i=1;i*i<=n;i++){

            if (n%i==0){
                System.out.println(i);
            }
            if (i != n/i){
                System.out.println(n/i);
            }
        }
    }

    static void advanceMethod_Sorted_Order(int n){
        int i=1;
        for (i=1;i*i<n;i++){
            if (n%i==0){
                System.out.println(i);
            }

        }
        for ( ;i>=1;i--){
            if (n%i==0){
                System.out.println(n/i);
            }
        }

    }
}
