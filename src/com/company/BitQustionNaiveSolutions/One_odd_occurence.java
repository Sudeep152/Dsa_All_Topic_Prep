package com.company.BitQustionNaiveSolutions;

public class One_odd_occurence {
    public static void main(String []  args){

        int [] arr={4,3,4,4,4,5,5};

        System.out.println(oneOccurring(arr));


    }
    static int oneOccurring(int [] arr){
        for(int i = 0; i < arr.length; i++)
        { int count = 0;
            for(int j = 0; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                    count++;
            }
            if(count % 2 != 0)
                return arr[i];
        }
        return 0;
    }
}
