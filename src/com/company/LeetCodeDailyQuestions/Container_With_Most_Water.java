package com.company.LeetCodeDailyQuestions;

public class Container_With_Most_Water {

    public  static  void main(String  [] args){

        int [ ]ar ={1,8,6,2,5,4,8,3,7};
        System.out.println(areBruteForce(ar));

    }
    static  int areBruteForce(int  [] arr ){

        int n = arr.length;
        int area= 0;

        for (int i=0 ;i<n;i++){
            for (int  j=i+1;j<n;j++){
                int HI = Math.min(arr [j],arr[i]);
                int Widt = j-i;
                int ans = HI*Widt;
                area =Math.max(ans,area);


            }


        }


return  area;

    }
    public int maxrea(int[] height) {

        int n = height.length;
        int area = 0;


        for(int  i =1;i<n;i++){
            int sec = i-1;

            int hi= Math.min(height[i],height[sec]);
            int wid= i-sec;
            int ans= hi*wid ;
            area= Math.max(ans,area);


        }



        return area;

    }
    public int maxArea(int[] height) {

        int len = height.length;
        int start = 0, end = len-1, max = Integer.MIN_VALUE;

        while(start < end){
            int hq = Math.min(height[start],height[end]);
            int wid= end-start;




        }

        return max;

    }
}
