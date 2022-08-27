package com.company.Stack;

import java.util.Stack;

public class LargestAreaHistogram {
    public  static  void main(String [] args){

        int [] arr= {1,8,6,2,5,4,8,3,7};
        System.out.println(LargestArea(arr));


    }
    static int [] nextRightSmallest(int []arr){
        int  n = arr.length;
        int [] RnsI = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(n-1);
        RnsI[n-1]=n;
        for (int i =n-2 ;i>=0;i--){

            while (stack.size() >0 && arr[i] < arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                RnsI[i]= arr.length;
            }else {
                RnsI[i] = stack.peek();
            }
            stack.push(i);

        }


     return RnsI;
    }

    static int[]    nextLeftSmallest (int [] arr ){
        int  n = arr.length;
        int [] nLeftSI = new int[n];
        nLeftSI[0] = -1;
        Stack<Integer> indexStack = new Stack<>() ;
        indexStack.push(0);

        for (int i =1; i<n;i++){
            while (indexStack.size()> 0 && arr[i] < arr[indexStack.peek()]){
                indexStack.pop();
            }

            if(indexStack.isEmpty()){
                nLeftSI[i]= -1;
            }else {
                nLeftSI[i]= indexStack.peek();
            }
            indexStack.push(i);
        }



   return nLeftSI;
    }

    static int LargestArea(int [] heights ){
        int  n = heights.length;
        int [] Left= nextLeftSmallest(heights);
        int [] Right= nextRightSmallest(heights);

        int Max=0;
        int area=0;

        if(heights.length%2==0){
            for (int i =0;i<n ;i++){
                int temp= Right[i] -Left[i]-1;
                area= heights[i] *temp;
                Max= Math.max(Max,area);
            }
        }else {
            for (int i =0;i<n ;i++){
                int temp= Right[i] -Left[i];
                area= heights[i] *temp;
                Max= Math.max(Max,area);
            }
        }







        return Max;

    }


}
