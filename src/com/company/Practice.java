package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        int []ar = {1,2,2,4,5,5};

//        removeValue(ar);
//        bestApp(ar);
       // movieZero(ar);
        test(ar);


    }



    static  void removeValue (int [] arr){

      int n=arr.length;
    int temp [] = new int[n];
    temp[0] = arr[0];
    int res =1;

    for (int  i=1;i<n;i++){
          if (arr[i] != temp[res-1]){
              temp[res] =arr[i];
              res++;
          }

    }

    for (int i=0;i<res;i++){
        arr [i]= temp[i];
    }

    for (int i=0;i<res ;i++){
        System.out.println(arr[i]);
    }
    }

    static void bestApp(int [] arr ){
        int n = arr.length;

        int res =arr[0];


        for (int i=1;i<n-1;i++){

            if (arr[res] != arr[res-1]){
                arr[i-1] =arr[res];
                res++;
            }
        }


        for (int  i=0;i<res;i++){
            System.out.println(arr[i]);
        }

    }
    static void movieZero(int [] arr){
        int count =-1;
        int n = arr.length;
        for (int i=0;i<n;i++){
            if (arr[i]!=0){
                count++;
                int temp = arr[i];
                arr[i]=arr[count];
                arr[count]= temp;
            }
        }



        for (int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }

    }

    static void test(int [] arr ){

        int n = arr.length;
        int res=1;
        int [] temp =new int[n];
        temp[0]= arr[0];

        for (int i=1;i<n;i++){
            if (arr[i] !=temp[res-1]){

                temp[res]= arr[i];
                res++;
            }
        }
        for (int i=0;i<res;i++){
            arr[i]=temp[i];
        }
        for (int i=0;i<res;i++){
            System.out.print(arr[i]+ " ");
        }
    }



}





