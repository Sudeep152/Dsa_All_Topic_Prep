package com.company.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFunction {
    public static  void main(String [] args){

        Queue<Integer> queue =new LinkedList<>();

        queue.add(12);
        queue.add(13);
        queue.add(14);
        queue.add(15);
        System.out.println(queue);

        System.out.println(  queue.peek());

    }
}
