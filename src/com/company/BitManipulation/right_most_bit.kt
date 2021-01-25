package com.company.BitManipulation
fun main(){


findRightMostBit(4)
    }
    fun findRightMostBit(k:Int) {

        var count = 1;
        var mask = 1;
        var n = k;
        while (n > 0) {

            if (n and mask == 1) {
                print(count)
                break
            }

            count++
            n = n shr 1

        }

    }