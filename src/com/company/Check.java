package com.company;

import java.util.Scanner;

public class Check {
    public  static void main(String[] args){
        mySeries();
        
    }

  static  void  mySeries(){


      Scanner sc = new Scanner(System.in);
      int T = sc.nextInt();
      while (T-->0){
          int a = sc.nextInt();
          int b = sc.nextInt();
          int n= sc.nextInt();

          int ans = a;
          for (int i =0; i< n;i++){
              ans = (int) (ans+(Math.pow(2,i)*b));
              System.out.println(ans);
          }

      }




      }




  }


