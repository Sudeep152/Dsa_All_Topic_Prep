package com.company.Stack;

import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String [] args){


        int [] arr={2,9,3,8,1,7,12};


    }
    public int[] maxSlidingWindow(int[] nums, int k) {

        int ans[] = new int[nums.length - k + 1];
        Deque<Integer> q = new LinkedList<>();

        int i = 0;
        int j = 0;

        while(j < nums.length){
            if(q.size() == 0){
                q.add(nums[j]);
            }
            else{
                while(q.size() > 0 && q.peekLast() < nums[j]){
                    q.removeLast();
                }
                q.add(nums[j]);
            }

            if(j - i + 1 < k) j++;

            else if(j - i + 1 == k){

                ans[i] = q.peek();

                if(nums[i] == q.peek()){
                    q.removeFirst();
                }

                i++;
                j++;
            }
        }
        return ans;

    }
}
