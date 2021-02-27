package com.company.SimpleMathMatics;

public class Check_For_Prime {
    public static void main(String []  args){

        int count=0;
        for (int i=1;i<=100;i++){

           // System.out.println(i + " "+prime_Naive_Solution(i));
            if (prime_Naive_Solution(i)){
                count++;
            }

        }
        System.out.println(count);
        System.out.println(Advanced_Prime(13));


     }

    static boolean prime_Naive_Solution(int n){
        int count=0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                count++;
            }
        }
        if (count ==2){
            return true;
        }else {
            return false;
        }

    }

    static boolean Advanced_Prime(int n){

        if(n==1)return false;
        if (n==2|| n==3)return true;
        if (n%2==0 || n%3==0)return false;

        for (int i=5;i*i<=n;i=i+6){
            if (n%i==0 || n%(i+2)==0){
                return false;
            }

        }

        return true;
    }

}
