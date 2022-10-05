package com.company.BinarySearch;

public class BinarySearchIntro {
    public static  void  main(String [] args){

        int  [] arr= {1,2,3,4,5,7};
        System.out.println(findIndex(arr,77));

    }
    static  int  findIndex(int []arr,int ele){

        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid= (start+end)/2;

            if (arr[mid]==ele){
                return mid;
            }else if(arr[mid] > ele){
                end= mid-1;
            }else {
                start=mid+1;
            }

        }
        return -1;
    }
}
