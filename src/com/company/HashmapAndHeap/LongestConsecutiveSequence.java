package com.company.HashmapAndHeap;
import  java.util.*;

public class LongestConsecutiveSequence {
    public  static void main(String [] args){
        int [] arr ={10,5,9,11,1,8,6,15,3,12,2};

        HashMap<Integer,Boolean> map =new HashMap<>();


        for (int i :arr ){
            map.put(i,true);
        }

        for(int i=0;i<arr.length;i++){
            int start = arr[i] -1;

            if(map.containsKey(start)){
                map.put(arr[i],false);
            }

        }

        int max=0;
        int maxLen=0;
        for(int val : arr){


            if(map.get(val)){
                int t=1;
                int startingPoint=val;
                while (map.containsKey(val+t)){
                    t++;
                }


                if( t > maxLen){
                    maxLen=t;
                    max=startingPoint;
                }

            }

        }

        for(int i=0;i<maxLen;i++){

            System.out.println(max+i);
        }

    }
}
