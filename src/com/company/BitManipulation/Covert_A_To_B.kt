package com.company.BitManipulation

fun main(){


    print("Convert A to B We need Change "+diffBitweenAtoB(2,13)+ " Bits" )

}
fun diffBitweenAtoB(a :Int ,b:Int):Int{

    var diff=0;
    diff=a xor b;
     var count=0;
    var n=diff
    while (n>0){
        count++
        n=n and  (n-1)
    }
    return count

}
