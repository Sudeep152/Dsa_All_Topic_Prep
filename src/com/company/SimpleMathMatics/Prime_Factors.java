package com.company.SimpleMathMatics;

import javax.sql.rowset.spi.SyncResolver;

public class Prime_Factors {
   public static void main(String [] args){

  //primeNaive_Factors(12);
  prime_Advanced(22);
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

   static void  primeNaive_Factors(int n){


       for (int i=2;i<n;i++) {

           if (  Advanced_Prime(i)) {
               int x = i;
               while (n % x== 0) {
                   System.out.println(i);
                   x = i * x;
               }

           }
       }




   }

   static void  prime_Advanced(int n ){

      for (int i=2 ; i*i<=n;i++){

          while ( n % i==0){
              System.out.println(i);
              n=n/i;
          }
      }
      if(n>1){
          System.out.println(n);
      }
   }
}
