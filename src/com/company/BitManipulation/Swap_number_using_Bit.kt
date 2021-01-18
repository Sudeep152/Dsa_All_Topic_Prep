package com.company.BitManipulation

fun main(){

    swap(2,3)
}
fun swap(a:Int,b:Int){
    var x=a
    var y=b
    x= x xor y
    y = x xor y
    x = x xor y

    print("A is $x \nB is $y")


}