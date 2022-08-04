package com.company.HashmapAndHeap;

import java.util.HashMap;

public class GetCommonEle {
    public static void main(String [] args){

        int [] ar1 = {1,1,2,2,2,3,5};
        int  [] ar2 = {1,1,1,2,4,5};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<ar1.length;i++){
            map.put(ar1[i],i);
        }


        for(Integer i =0;i <ar2.length;i++){

            if(map.containsKey(ar2[i]) ){
                map.remove(ar2[2]);
                System.out.println(ar2[i]);
            }

        }





    }

}
