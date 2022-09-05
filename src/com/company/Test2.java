package com.company;

import java.util.Arrays;

public class Test2 {
    public  static  void main(String [] args){


        int []  arr1 ={1};
        int [] arr2=  {3,4};

        int [] answer= mergetwoSorted(arr1,arr2);

        System.out.println(answer[1]);
System.out.println(findMedianSortedArrays(arr1,arr2));


    }

     static  public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int [] sorterM =mergetwoSorted(nums1,nums2);

        int n = sorterM.length;
         int start = 0;
         int end=1;
         double ans =0;
        if(n%2!=0){

           while (end <n-1){
               end=end+2;
               start++;
           }
            return sorterM[start];
        }else {

            while (end <n-1){

                end++;
                start++;
                int temp =sorterM[start-1];
                ans=sorterM[start]+temp;
            }
            return  ans/2;

        }






     }



    static int [] mergetwoSorted(int [] arr1,int [] arr2){

        int n = arr1.length+arr2.length;

        // HashMap<Integer> list = new HashMap<>();
        int []  answer = new int[n];

        for(int  i=0; i<arr1.length;i++)
        {

            answer[i]= arr1[i];

        }

        for(int i =0;i<arr2.length;i++){
            answer[arr1.length+i]= arr2[i];
        }

        Arrays.sort(answer);

        return answer;

    }

}
