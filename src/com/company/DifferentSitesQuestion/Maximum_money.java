package com.company.DifferentSitesQuestion;

import java.util.stream.StreamSupport;

public class Maximum_money {

    public static void main(String [] args){
        //Question link
        // https://docs.google.com/document/d/1PZg04v8pvgmHMZVDWL3qTw6khCYxzxayv0vhF9J-KKw/edit?usp=sharing

        System.out.println(maximizeMoney(2,12));

    }
    static int maximizeMoney(int N , int K) {
        // code here
        int res=0;
        for (int i=1;i<=N;i++){

            if (i%2!=0) {
                res = res + K;
            }
        }

        return res;
    }

}
