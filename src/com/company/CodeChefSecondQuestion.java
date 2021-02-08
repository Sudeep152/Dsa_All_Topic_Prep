package com.company;

import java.util.*;

import static java.lang.Math.floorMod;
import static java.util.Collections.*;

public class CodeChefSecondQuestion {
    public static void main(String [] args){


        fun();

    }
    static  void fun(){

        Scanner sc =new Scanner(System.in);
        int T=sc.nextInt();

        while (T-->0){
            int n =sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=1;i<=n;i++){
                int Ath=sc.nextInt();


                arr.add(Ath);

            }
//            Collections.sort(arr);
//            int []arr1={arr.get(0),arr.get(n-1)};
////            for (int i=0;i<arr1.length;i++){
////                System.out.println(arr1[i]);
////            }
//            int result= Math.abs(arr1[0]-arr1[1]);
//
//            System.out.println(result*2);
            int max=Collections.max(arr);
            int min=Collections.min(arr);
            long result=max-min;

            System.out.println(result*2);
        }

    }
    static void fun2(){
        Scanner sc =new Scanner(System.in);
        int T=sc.nextInt();

        while (T-->0){
            int n =sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=1;i<=n;i++){
                int Ath=sc.nextInt();
                arr.add(Ath);

            }



            int max=Collections.max(arr);
            int min=Collections.min(arr);
            int result=max-min;

            System.out.println(result*2);

        }
    }

}
