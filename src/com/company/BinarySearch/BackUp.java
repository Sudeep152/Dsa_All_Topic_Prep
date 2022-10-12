package com.company.BinarySearch;

public class BackUp {
    public static void main(String [] args){

        int []arr = {2,4,10,10,10,18,20};
      int b =  firstOccIndex(arr,10);
        int  a= lastOccIndex(arr,10);
System.out.println(a-b+1);
    }
    static int firstOccIndex(int arr[],int ele){
        int start =0;
        int end = arr.length-1;
        int index =0;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]==ele){
                index=mid;
                end=mid-1;
            }else if (arr[mid]>ele){
                end=mid-1;
            }else {
                start=mid+1;
            }


        }
        return index;

    }
    static int lastOccIndex(int arr [],int ele){
        int start = 0;
        int end  = arr.length-1;
        int index =0;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]==ele){
                index=mid;
                start=mid+1;
            }else if(arr[mid]>ele){
                end=mid-1;
            }else {
                start=mid+1;
            }



        }

return index;
    }
}
