package com.company.SimpleMathMatics;

public class Computing_Power {
    public static  void main(String [] args){

        System.out.println(logarithmic_Advanced_Recursion(3,53 ));
        System.out.println(Naive_Calc_Pow(3,53));
        System.out.println(Advanced_And_Efficient_method_Power(3,53));


    }
    static  int Naive_Calc_Pow(int a,int b){
        int res=1;

        for (int i=1;i<=b;i++){
            res=res*a;
        }
        return res;
    }

    static int logarithmic_Advanced_Recursion(int m,int n){

        if (n==0){
            return 1;
        }
        if (n==1){
            return m;
        }
        if (n%2!=0){
            return logarithmic_Advanced_Recursion(m, n/2) *logarithmic_Advanced_Recursion(m, n/2) *m;
        }


        return logarithmic_Advanced_Recursion(m, n/2) *logarithmic_Advanced_Recursion(m, n/2);
    }

    static  int Advanced_And_Efficient_method_Power(int m,int n){


        int res=1;
        while (n>0){

            if(n%2!=0){
                res=res*m;
            }
            m=m*m;
            n=n/2;
        }
        return res;
    }
}
