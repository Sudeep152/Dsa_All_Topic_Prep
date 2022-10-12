package com.company.BinarySearch;

public class CountOfAnElementInSortedArray {
    public  static void main(String  [] args){

        int [ ] arr={2,4,10,10,10,18,20};

        System.out.println(count(arr,10));
    }
    static  int count(int [] arr ,int ele){

        int count=0;
        int start = 0;
        int end = arr.length-1;
        int firstIndex= 0;
        int lastIndex =0;

        while (start<=end){
            int mid= start+(end-start)/2;

            if (arr[mid]==ele){
              firstIndex=mid;
              end =mid-1;

            }else  if(arr[mid]>ele){
                end= mid-1;
            }else {
                start = mid+1;
            }
        }
        int start1 = 0;
        int end1 = arr.length-1;

        while (start1<=end1){
            int mid= start1+(end1-start1)/2;

            if (arr[mid]==ele){
                lastIndex=mid;
                start1=mid+1;

            }else  if(arr[mid]>ele){
                end1= mid-1;
            }else {
                start1 = mid+1;
            }
        }





        count = lastIndex-firstIndex+1;
        return count;
    }
}
