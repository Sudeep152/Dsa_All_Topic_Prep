package com.company.Array.LeetcodeQuestion;

import java.util.ArrayList;
import java.util.List;

public class Kids_with_1431 {
    public static  void main(String [] args){
        int [] arr = {2,3,5,1,3};

        ArrayList<Boolean> my = (ArrayList<Boolean>) kidsWithCandies(arr,3);

        System.out.print(my);




    }
  static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

      ArrayList<Boolean> list = new ArrayList<>();
      int n  = candies.length;

      for (int  i=0;i<n;i++){
          if (candies[i] > i){
              list.add(true);
          }else {
              list.add(false);
          }

      }

      return list;

    }
}
