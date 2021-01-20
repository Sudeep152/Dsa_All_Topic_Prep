package com.company.BitManipulation

fun main(){

    kthBitSetOrNot(6,4)

}
fun kthBitSetOrNot( n:Int,k:Int){

    if(n and (1 shl (k-1)) !=0) print("Set Bit")
    else print("Not Set Bit")
}