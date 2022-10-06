package com.company.BinarySearch;

public class OrderNotKnownSearch {
    public  static  void main(String [] args){

        int []arr = {7,5,4,2,1};

        System.out.println(search(arr,4));


    }
    static int search(int [] arr ,int ele){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;

            if (whichOrder(arr)){
                if (arr[mid] == ele){
                    return mid;
                }else if(arr[mid]>ele){
                    end=mid;
                }else {
                    start=mid;
                }
            }else {
                if (arr[mid] == ele){
                    return mid;
                }else if(arr[mid]>ele){
                    start=mid;
                }else {
                    end=mid;
                }

            }






        }
 return -1;


    }
     static  boolean whichOrder(int [] arr){
        int n= arr.length;
        if (arr[0]<arr[1]){
            return true;
        }
        return false;
     }
}
