package com.company.SimpleMathMatics;

public class Trailing_Zeros_in_Factorial {
    public static  void main(String [] args){


        //System.out.println(countTrailing(10));
        System.out.println(ADVTrailing(100));
    }
    public  int Facto(int n){
        int res=1;
        for(int  i=1;i<=n;i++){

            res=res*i;
        }
        return res;
    }
    static  int countTrailing(int n){
        Trailing_Zeros_in_Factorial tzr=new Trailing_Zeros_in_Factorial();
        int temp = tzr.Facto(n);
        int count=0;
        while (temp %10 ==0){

            count++;
            temp=temp/10;


        }
        return count;

    }

    ////Trailing Zeros Advanced Method

    static int ADVTrailing(int n){
        int count=0;
        for (int i=5;i<=n;i=i*5){

            count=count+ (n/i);
        }
        return count;
    }

}
