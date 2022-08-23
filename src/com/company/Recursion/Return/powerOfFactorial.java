package com.company.Recursion.Return;


public class powerOfFactorial{
public  static  void  main(String  [] args){


    System.out.println(power(2,4));


}
static  int power(int n ,int p){

    if(p==0){
        return 1;
    } else if(p==1){
        return n;
    }
    return  n*power(n,p-1);
}


}
