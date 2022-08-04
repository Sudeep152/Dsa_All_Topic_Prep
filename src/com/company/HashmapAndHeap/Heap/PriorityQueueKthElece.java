package com.company.HashmapAndHeap.Heap;

import java.util.PriorityQueue;

public class PriorityQueueKthElece {
    public static void main(String []  args) {


        PriorityQueue<Integer> list = new PriorityQueue();



        int []  arr ={2,10,5,17,7,18,6,4};


        for (int i=0;i<arr.length;i++){

            if(list.size() < 3){
                list.add(arr[i]);
            }else{

                if(arr[i] > list.peek()){

                    list.remove();
                    list.add(arr[i]);


                }
            }


        }




        while (list.size() !=0){


            System.out.println(list.peek());
            list.remove();


        }

    }
}
