package com.company.Recursion.Return;

public class PowerProgram {
    public  static void main(String [] args){

        System.out.println(pw(3,4));


    }
    static int pw(int a,int b){

        if(b==0){
            return 1;
        }


        int pw =  a* pw(a,b-1);

        return pw;
    }
}
