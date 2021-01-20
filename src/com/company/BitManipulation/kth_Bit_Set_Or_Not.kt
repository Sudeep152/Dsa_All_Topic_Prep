package com.company.BitManipulation

fun main(){

  print(kthBitSetOrNot(5,2))

}
fun kthBitSetOrNot( n:Int,k:Int): Boolean {

    return n and (1 shl (k-1)) !=0
}
