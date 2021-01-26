package com.company.BitManipulation

fun main(){

    var array= arrayListOf(1,2,3,4,6,7)
    print(findMissingElementInArray(array))
}

fun findMissingElementInArray(array: ArrayList<Int>):Int {
    var xorA=0;
    var xorN=0;
    for (i in array.indices){
        xorA=xorA xor array[i]
    }
    for (i in 0..array.size+1){
        xorN=xorN xor i
    }
    return  xorA xor xorN


}