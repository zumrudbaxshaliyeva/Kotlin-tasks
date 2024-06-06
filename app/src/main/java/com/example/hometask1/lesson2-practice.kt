package com.example.hometask1

import java.util.Scanner

fun main() {
    /*val scanner=Scanner(System.`in`)
    println("Adinizi daxil edin")
    val firstName=scanner.next()
    println("Yaşınızı daxil edin")
    val  age=scanner.nextInt()
    println("Boyunuzu daxil edin")
    val length=scanner.nextDouble()
    println("Tələbəsinizmi")
    val isStudent=scanner.nextBoolean()
    println("Sizin adiniz-${firstName}dir")
    println("Sizin yasiniz-${age}dir")
    println("Sizin boyunuz-${length}dir")*/


   val scanner = Scanner(System.`in`)

    println("ilk imtahan neticenizi daxil edin")
    val degree1 = scanner.nextDouble()
    println("ikinci imtahan neticenizi daxil edin")
    val degree2 = scanner.nextDouble()
    println("ucuncu imtahan neticenizi daxil edin")
    val degree3 = scanner.nextDouble()
    val result = (degree1 + degree2 + degree3) / 3
    println("sizin ortalama nəticəniz-${result}-dir")

    if (result >=90.0) {
        println("Sizin neticeniz AA")
    } else if (result > 70.0 && result < 80.0) {
        println("Sizin neticeniz BB")
    } else if (result>80.0 && result>70.0){
        println("Sizin neticeniz CC")
    }
else{
    println("Sizin neticeniz FF")
}
}
