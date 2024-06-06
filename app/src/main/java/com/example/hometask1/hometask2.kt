package com.example.hometask1

import java.util.Scanner

fun main(){
    //1) İstifadəçidən 2 dənə ədəd istəyin. Bu 2 ədədin cəmi, fərqi, hasili, qisməti və ədədi ortasını ekranda göstərsin.
    /*val scanner=Scanner(System.`in`)
    println("Birinci 'ədədi daxil edin")
    val number1=scanner.nextDouble()
    println("İkinci 'ədədi daxil edin")
    val number2=scanner.nextDouble()
    val sum=number1+number2
    println("sum-${sum}")
    val difference=number1-number2
    println("fərq-${difference}")
    val multiply=number1*number2
    println("hasil-${multiply}")
    val destiny=number1/number2
    println("qismət-${destiny}")
    val avarage=(number1+number2)/2
    println("ədədi orta-${avarage}")*/



    //2) İstifadəçi rəng adı daxil etsin,hər daxil edilən rəngə uyğun olaraq rəng haqda məlumat yazilsin.(Məsələn: yaşil rəng təbiət və sağlamlîğin ruhudur və s.)

    /*val scanner=Scanner(System.`in`)
    println("rəng daxil edin")
    val color=scanner.next()
    when(color){
        "yaşıl"->{
           println("${color} rəng təbiət və sağlamlîğin ruhudur")
        }
        "qırmızı"->{
            println("${color} rəng fiziki güc, hərəkətliliyin rəmzidir. ")
        }
        else->{
            println("Bilinməyən rəng")
        }
    }*/



    //3)İstifadəçidən yaş alın. Yaşı 20-dən yuxarıdırsa, "Səs verə bilər". çap edin. Əgər yaş 20-dirsə, "Hələ səs verə bilməzsən, amma tezliklə!" çap edin. yaş 20-dən kiçikdirsə, "Səs verə bilməzsiniz".çap edin.

   /* val scanner=Scanner(System.`in`)
    println("Yaşınızı daxil edin")
    val age=scanner.nextInt()
    if (age>20){
        println("Səs verə bilər")
    }
    else if(age===20){
        println("Hələ səs verə bilməzsən, amma tezliklə!")
    }
    else{
        println("Səs verə bilməzsiniz")
    }*/



    //4)Cüt - Tək Yoxlama:* İstifadəçidən rəqəm alın. Əgər rəqəm cütdürsə, "Bu cüt rəqəmdir" mesajını verin, təkdirsə, "Bu tək rəqəmdir" deyin.

    val scanner=Scanner(System.`in`)
    println("rəqəm daxil edin")
    val number=scanner.nextInt()
    if(number%2==0){
        println("Bu cüt rəqəmdir")
    }
    else{
        println("Bu tək rəqəmdir")
    }
}