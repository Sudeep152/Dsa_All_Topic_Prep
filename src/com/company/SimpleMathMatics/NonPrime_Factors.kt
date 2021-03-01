package com.company.SimpleMathMatics

fun main (){

    print(nonPrimeFactors(12))
}


fun Advanced_Prime(n: Int): Boolean {
    if (n == 1) return false
    if (n == 2 || n == 3) return true
    if (n % 2 == 0 || n % 3 == 0) return false
    var i = 5
    while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) {
            return false
        }
        i = i + 6
    }
    return true
}

fun nonPrimeFactors(n :Int){

    for ( i in 2 until n){

        if (!Advanced_Prime(i)){
            var x = i;
            while (n%x==0){
                println(i)
                x *= i;
            }
        }
    }

}
