package com.company.BitManipulation

fun main(){

    powerOftwo(0)
}

fun powerOftwo(k:Int) {

    var n=k
    var count=0;
       while (n>0){
           n=n and (n-1)
           count++;
    }
    if (count==1){
        print("Yes")
    }else{
        print("No")
    }

}