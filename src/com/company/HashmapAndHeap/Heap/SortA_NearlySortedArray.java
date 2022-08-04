package com.company.HashmapAndHeap.Heap;

import java.util.PriorityQueue;

public class SortA_NearlySortedArray {

    public static void main(String [] args){



        int [] arr = {2,3,1,4,6,7,5,8,9};
        int  k=3;
        PriorityQueue<Integer> qp =new PriorityQueue<>();

        for (int i =0 ;i<=k;i++){
            qp.add(arr[i]);
        }

        for(int i =k+1;i<arr.length;i++){
            System.out.print(qp.remove() + " ");
            qp.add(arr[i]);
        }

        while(qp.size() > 0){
            System.out.print(qp.remove()+ " ");
        }


    }
}
