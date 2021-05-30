package com.company.Array.OperationOnArray;

import java.util.ArrayList;

public class SecondLargestElements {
    public static void main(String[] args){


        int [] arr={2,1,2};

      System.out.println(naiveAppForSecondLargestElement(arr));
//


    }
    static int naiveAppForSecondLargestElement(int []arr){

        int largest=getIndexGreat(arr);
        int result=-1;

        for (int i=0;i<arr.length;i++){

            if (arr[i]!=arr[largest]){

                if (result==-1){

                    result=i;
                }else if (arr[i]>arr[result]){
                    result=i;
                }


            }


        }

        return result;

    }
    static int getIndexGreat (int []arr){

        int max =0;
        int index=0;

        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
                index = i;
            }


        }
        return index;
    }
//    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
//    {
//        //code here.
//
//        int largest=getIndexGreat(arr);
//        int res=-1;
//        int seL=0;
//        int L=0;
//
//        for (int i=0;i<sizeOfArray;i++){
//            if (arr[i]!=arr[largest]){
//
//                if (res==-1){
//                    res=i;
//                }else if (arr[i]>arr[res]){
//                    res=i;
//                }
//
//            }
//
//        }
//        seL=arr[res];
//        L= arr[getIndexGreat(arr)];
//        ArrayList<Integer> arrayList=new ArrayList<Integer>();
//        arrayList.add(L);
//        arrayList.add(seL);
//
//                return arrayList;
//    }



}
