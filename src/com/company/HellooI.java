package com.company;

import java.util.HashMap;

public class HellooI {

    public static void main(String [] args){



        int [] arr = {1,2,3,1,2};

        //ser(arr);

        //// 1,2,3,3,8
        //6
        //



        sa(arr);
    }



    static  void  ser(int [] arr){

        int  n = arr.length;

        for (int i =0;i<n;i++){
            int count =0;

            for (int j=0;j<n;j++){

                if (arr[i] ==arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i] +" ->"+ count );



        }



    }


    static void  sa(int [] arr ){

        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();

//        for (int i =0; i<n;i++){
//            map.put(arr[i],0);
//        }

        for (int i =0;i<n ;i++){
            int count=0;

            map.put(arr[i],count);
            if (map.containsKey(arr[i])){
                count++;
                map.put(arr[i],count);

            }

        }
        System.out.println(map);


    }
    //stack1 1
    //stack2 1
  // 3


}
