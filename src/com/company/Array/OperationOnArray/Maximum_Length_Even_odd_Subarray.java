package com.company.Array.OperationOnArray;

public class Maximum_Length_Even_odd_Subarray {
    public static void main(String  [] args){

    int [] ar= {7,10,13,14};
    System.out.println(Length_even_odd_(ar));
    System.out.println(bestApp(ar));

    }

    static int Length_even_odd_(int [] arr){
        int n = arr.length;
        int res =1;

        for (int i=0;i<n;i++){
            int curr=1;
            for (int j=i+1;j<n;j++){
                if (arr[j]%2==0 && arr[j-1]%2!=0 ||
                        arr[j-1]%2==0 && arr[j]%2!=0
                ){
                    curr++;
                }else {
                    break;
                }
            }
            res =Math.max(res,curr);
        }
        return  res;
    }



    static int bestApp(int [] arr ){

        int n = arr.length;
        int res = 1;
        int cu = 1;

        for (int i =1;i<n;i++){

            if (arr [i]%2==0 && arr[i-1]%2!=0 || arr[i]%2!=0 &&arr[i-1]%2==0){
             cu++;
                res = Math.max(res,cu);
            }else {
                cu=1;
            }

        }
        return res;

    }
}
