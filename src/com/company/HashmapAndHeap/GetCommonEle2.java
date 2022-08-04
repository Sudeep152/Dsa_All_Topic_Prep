package com.company.HashmapAndHeap;
import  java.util.*;

public class GetCommonEle2 {
    public static void main(String [] args){


        int [] ar1 = {1,1,2,2,3,5};
        int  [] ar2 = {1,1,1,2,2,4,5};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<ar2.length;i++){
            map.put(ar2[i],i);
        }
 boolean s = true;
        for(int i = 0;i<ar1.length;i++){
            if(map.containsKey(ar1[i])){
                System.out.println(ar1[i]);
            }
        }
    }

}
