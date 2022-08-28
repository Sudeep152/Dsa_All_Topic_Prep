package com.company.Recursion.Return;

public class LastIndexOccEle {
    public  static  void  main(String [] args){

        int [] ar= {2,3,6,9,8,3,2,3,6,4};

        System.out.println(lastOCC(ar,0,3));


    }
    static int lastOCC(int [] ar ,int index,int data){

        if (index>ar.length-1)return -1;

        int smallPob =  lastOCC(ar,index+1,data);
        if (smallPob== -1){
            if (data == ar[index]){
                return index;
            }else {
                return -1;
            }
        }
      else {
            return  smallPob;
        }

    }
}
