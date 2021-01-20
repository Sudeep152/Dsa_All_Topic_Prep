package com.company.BitManipulation

fun main(){


    print(nCountSetBit(0))

}
fun kBitSetOrNot( n:Int,k:Int): Boolean {

    return n and (1 shl (k-1)) !=0
}
fun nCountSetBit(n:Int):Int{
    var count= 0

    for (i in 1 .. n){
        if (kthBitSetOrNot(n,i)){
            count++;
        }

    }
    return count;
}