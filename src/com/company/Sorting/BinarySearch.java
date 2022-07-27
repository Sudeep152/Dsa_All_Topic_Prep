package com.company.Sorting;

public class BinarySearch {
    public static  void main (String [] args){

        int [] ar = {5,15,25,25};

        System.out.println(naiveApp(ar,15));
        System.out.println(bestApproach(ar,15));

    }
    static int naiveApp(int [] ar,int x ){

        int n= ar.length;

        for (int i =0;i<n;i++){
            if (ar[i] ==x){
                return i+1;
            }
        }
        return -1;

    }

    static int bestApproach(int [] arr ,int x){
        int low= 0;
        int n = arr.length;
        int high= n-1;
        int mid=0;
        while (low<=high){
            mid= low+high/2;
            if (arr[mid]==x){
                return mid;
            }else if(arr[mid] >x){
                high=mid-1;
            }else {
                low=mid+1;
            }

        }

        return -1;
    }
}
