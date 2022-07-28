package com.company.String.Leetcode;

public class Jewels_and_Stones {
    public  static void main(String [] args){

    String    jewels = "z";
    String stones = "ZZZ";
    System.out.println(numJewelsInStones(jewels,stones));


    }
    static  int numJewelsInStones(String jewels, String stones) {

        int count  =0;
        int n = stones.length();

        for (int i =0;i<n;i++){

            for (int j =0;j<jewels.length();j++){
                if (stones.charAt(i) == jewels.charAt(j)){
                    count++;
                }
            }

        }
return count;
    }
}
