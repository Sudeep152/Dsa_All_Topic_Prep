package com.company.BinarySearch;

public class BinarySearchDescending {
    public  static  void  main(String [] args){
        int []a4=  {20,17,15,14,13,13,10,9,8,4};
        System.out.println(getIndex(a4,15));

    }
    static  int getIndex(int [] arr ,int ele){

        int start = 0;
        int end = arr.length-1;

        while (start <=end){
            int mid = (start+end)/2;

            if (arr[mid] == ele)return mid;
            else if(arr[mid]>ele) start=mid+1;
            else  end =mid-1;

        }


        return -1;
    }
}
