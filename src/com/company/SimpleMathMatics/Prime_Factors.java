package com.company.SimpleMathMatics;

import javax.sql.rowset.spi.SyncResolver;
import java.util.Arrays;

public class Prime_Factors {
   public static void main(String [] args){

       int [] A={2, 8, 3, 4};
       int N= A.length;



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
