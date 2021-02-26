package com.company.SimpleMathMatics;

public class Factorial_Of_Number {
    public static void  main(String  []  args){

        Factorial_Of_Number function =new Factorial_Of_Number();

        System.out.println(function.Facto(6));
        System.out.println(function.recursiveFacto(6));
    }
    public  int Facto(int n){
        int res=1;
        for(int  i=1;i<=n;i++){

            res=res*i;
        }
        return res;
    }
    public  int recursiveFacto(int n){

        if(n==1){
            return  n;
        }

        return n*recursiveFacto(n-1);

    }
}
