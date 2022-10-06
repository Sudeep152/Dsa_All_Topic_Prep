package com.company.BinarySearch;

public class FirstAndLastOccurrence {

    public static  void main(String [] args){

        int [] arr = {2,4,10,10,10,18,20};
        getFirstAndLast(arr,10);
    }
     static  void getFirstAndLast(int []arr, int ele){

        int start = 0;
        int end = arr.length;
        int firstIndex = 0;
        int LastIndex=0;

        while (start<=end){
            int mid = start +(end-start)/2;
            if (arr[ mid ] ==ele){
                firstIndex = start+1+1;
                end = mid-1;
                LastIndex =
                end-1+1;
                ;
                start= mid+1;

            }else if(arr[mid]>ele){
                end = mid-1;
            }else {
                start=mid+1;
            }





        }


        System.out.println(firstIndex +" ,"+LastIndex);
     }

}
