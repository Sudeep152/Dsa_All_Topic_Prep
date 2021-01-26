package com.company.BitQustionNaiveSolutions

fun main(){

    val arr = intArrayOf(4, 3, 4, 4, 4, 5, 5)
    print(oneOccurring(arr))
}
fun oneOccurring(arr: IntArray): Int {
    for (i in arr.indices) {
        var count = 0
        for (j in arr.indices) {
            if (arr[i] == arr[j]) count++
        }
        if (count % 2 != 0) return arr[i]
    }
    return 0
}

