package com.company;

import java.util.*;

public class Vipin {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {


            int X = sc.nextInt();
            int Y = sc.nextInt();

            int Distance = 0;
            int tempMax = Math.max(X, Y);
            int temMin = Math.min(X, Y);
            Distance = tempMax - temMin;

            if (Distance % 2 == 0) {
                System.out.println(Distance / 2);
            } else {
                System.out.println((Distance + 1) / 2);
            }


        }

//    static String convertTime(String time)
//    {
//        String format;
//        String[] arr = time.split(":");
//        int hh = Integer.parseInt(arr[0]);
//
//        if (hh > 12) {
//            hh = hh - 12;
//            format = "PM";
//        }
//        else if (hh == 00) {
//            hh = 12;
//            format = "AM";
//        }
//        else if (hh == 12) {
//            hh = 12;
//            format = "PM";
//        }
//        else {
//            format = "AM";
//        }
//
//
// return format;
//    }
//
//
//    static void  SecondProblem(List<Integer> options){
//
//
//        Collections.sort(options);
//        int n=0;
//        while (n<2){
//            System.out.println(options.get(n));
//            n++;
//        }
//
//    }
//    static int solve(int n){
//        if (n==0){
//            return 0;
//        }
//
//        return (int) n/2;
//
//    }
//    static long solution(long n){
//        long sum =0;
//        int  i=1;
//        while (i<=n){
//            int temp=0;
//           temp= 2*i;
//           if (temp >n){
//               break;
//           }
//           sum=sum+temp;
//            i++;
//        }
//        return sum;
//    }
//
//
//
//    static  void SlidingWindow(int []arr ,int windowsize ){
//
//        int start =0;
//        int end =0;
//
//        Queue<Integer>list = new LinkedList<>();
//        int i=0;
//        int n = arr.length;
//        int [] result = new int [n-windowsize+1];
//
//        while(end<n){
//
//            if(arr[end] <0){
//                list.add(arr[end]);
//            }
//
//            if(end-start+1 !=windowsize){
//                end++;
//            }else{
//
//                if(list.isEmpty()){
//                    result[i]=0;
//                    i++;
//                }else{
//                    result[i] = list.peek();
//                    i++;
//                }
//
//                if(!list.isEmpty()  &&  arr[start] == list.peek()){
//                    list.poll();
//                }
//                start++;
//                end++;
//
//            }
//
//
//        }
//
//        for(int j=0;j<result.length;j++){
//
//            System.out.println(result[j]);
//        }
//
//
//
//
//
//
//
//    }

    }
}