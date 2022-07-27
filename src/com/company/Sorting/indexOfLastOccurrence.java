//package com.company.Sorting;
//
//public class indexOfLastOccurrence {
//    public static void main(String[] args) {
//
//
//        int[] arr = {10, 15, 20, 20, 40, 40};
//
//
//        int j = 1, num1 = 4;
//        while (++j <= 10)
//        {
//            num1++;
//        }
//        System.out.println(num1);
//    }
//
//    static  String sl(int [] arr ,int n){
//
//        int temp[] = {1, 0};
//
//        int result = 0, sum = 0;
//
//        for (int i = 0; i <= n - 1; i++)
//        {
//
//            sum = ((sum + arr[i]) %
//                    2 + 2) % 2;
//            temp[sum]++;
//        }
//
//        result = result + (temp[0] *
//                (temp[0] - 1) / 2);
//        result = result + (temp[1] *
//                (temp[1] - 1) / 2);
//
//        if (result ==0){
//            return "YES";
//        }else {
//            return "NO";
//        }
//
//    }
//}
////    static int naiveApp(int [] arr,int x ){
////        int n= arr.length;
////        int pos=0;
////        for (int i =1;i<n;i++){
////
////            if (arr[i] == x ){
////                if (arr[i] ==arr[i-1]){
////                    pos=i;
////                    return pos;
////                }else {
////                    pos++;
////                    return pos;
////                }
////
////            }
////        }
////        return -1;
////    }
////
////    static int bestApp(int [] arr,int x){
////        int n= arr.length;
////        int low=0;
////        int high=n-1;
////
////        while (high>=low){
////
////            int mid = high+low/2;
////
////            if (arr[mid] ==x){
////                if (arr[mid] ==arr[mid-1]){
////                    return mid;
////                }
////
////            }else
////
////
////
////        }
////
////        return -1;
////    }
////}
//
//
