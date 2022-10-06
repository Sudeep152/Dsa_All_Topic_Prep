package com.company.BinarySearch;

public class LastOccurrence {
    public static  void main(String [] args){
        int [] arr = {2,4,10,10,10,18,20};
        System.out.println(getLast(arr,10));

    }
    static int getLast (int  [] ar,int ele){
        int start =0;
        int end = ar.length-1;
        int ans =0;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (ar[mid] == ele){
                ans = mid;
                start = mid+1;
            }else if(ar[mid]>ele){
                end= mid-1;
            }else {
                start = mid+1;
            }
        }

return  ans;
    }
}
