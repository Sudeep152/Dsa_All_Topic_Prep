package com.company.BitManipulation

fun main(){

    checkOdd(8)

}
fun  checkOdd( n:Int){

    if (n and 1==0){
        print("Even Number")
    }else{
        print("Odd Number")
    }

}