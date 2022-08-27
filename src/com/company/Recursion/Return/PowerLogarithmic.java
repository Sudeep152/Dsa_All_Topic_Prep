package com.company.Recursion.Return;

public class PowerLogarithmic {
    public static  void  main(String [] args){

        System.out.println(pow(5,4));


    }
    static  int   pow(int a,int b){
        if(b==0)return 1;
        int pnE= pow(a,b/2) * pow(a,b/2);
        if(b%2==0){
            return  pnE;
        }else {
            int ans  =  pnE*a;
            return ans;
        }



    }
}
