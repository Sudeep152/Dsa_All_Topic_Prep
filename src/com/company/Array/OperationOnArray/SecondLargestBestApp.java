package com.company.Array.OperationOnArray;

import java.util.ArrayList;

public class SecondLargestBestApp {
    public static void main(String []  args){



        int []arr ={2,1,2};
        System.out.println(AnotherMethod(arr));
    }

    static int bestApproach(int [] arr){

        int small=-1;
        int large=0;

        for (int i=1;i<arr.length;i++){
            if (arr[i]>arr[large]){
                small=large;
                large=i;
            }else if (arr[i]!=arr[large]){
                if (small==-1 || arr[i]>arr[small]){
                    small=i;
                }
            }



        }
        return large;
    }
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
          ArrayList<Integer> arrayList=new ArrayList<>();
          int L=0;
          int res=-1;
          for (int i=1;i<sizeOfArray;i++){
              if (arr[i]>arr[L]){
                  res=L;
                  L=i;
              }else if(arr[i]!=arr[L]){
                  if (res==-1 || arr[i]>arr[res]){
                      res=i;
                  }
              }

          }
          L=arr[L];
          res=arr[res];
          arrayList.add(L);
          arrayList.add(res);

          return arrayList;


    }

    static ArrayList<Integer> AnotherMethod(int[ ]x){

        int largest=0;
        int largest2=-1;
        ArrayList<Integer> list =  new ArrayList<>();
        int i=0;
        for (i=0;i<x.length;i++){
            if (x[i]>largest){
                largest=x[i];
            }

        }
        for ( i=0;i<x.length;i++){

            if (x[i]>largest2){
                if (x[i]==largest)
                    continue;
                largest2=x[i];
            }

        }

        list.add(largest);
        list.add(largest2);

        return list;

    }


}
