package com.company.BitManipulation

fun main(){

    convert(-5)
}
fun convert(n: Int) {
    var value = 0
    for (i in 31 downTo 0) {
        value = n shr i
        if (value and 1 == 1) {
            print("1")
        } else {
            print("0")
        }
    }
}
