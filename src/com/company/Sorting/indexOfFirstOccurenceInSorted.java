package com.company.Sorting;

public class indexOfFirstOccurenceInSorted {
    public static void main(String  [] args){


        int [] arr = {15,15,15};
        System.out.println(naiveApp(arr,15));
        System.out.println(bestApp(arr,15));
    }
    static int naiveApp(int [] ar,int x){

        int pos=0;

        for (int i=0;i<ar.length;i++){
            if (ar[i] ==x){
                pos=i;
                return pos;
            }
        }

return -1;
    }

    static int bestApp(int [] arr,  int x){

        int low  = arr[0];
        int n = arr.length;
        int high= arr[n-1];

        while (low<= high){

            int mid  = low+high/2;
            if (arr[mid] ==x){
                return mid;
            }else  if(arr[mid] <x){
                low=mid+1;
            }else {
                high=mid-1;
            }

        }
        return -1;
    }
}
