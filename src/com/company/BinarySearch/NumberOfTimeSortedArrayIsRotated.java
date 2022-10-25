package com.company.BinarySearch;

public class NumberOfTimeSortedArrayIsRotated {
    public  static  void main(String [] args){

        int  []  arr = {11,12,15,18,2,5,6,8};
        System.out.println(countTime(arr));


    }
     static  int countTime(int [] arr ){
        int n = arr.length;
        int start =0;
        int end  = n-1;
        int ans =0;
        while (start<=end){
            int mid= start +  (end -start)/2;

            if ( arr [mid] <arr[mid+1] && arr[mid-1]>arr[mid]){
                ans=mid;
                return  ans;
            }else if (arr[mid]>arr[end]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return ans;
     }
}
