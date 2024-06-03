package com.example.hometask1
fun main(){
    //1)Tərəfi 5 olan kvadratın sahəsini tapın.
    val side=5
    val area=side*side
    println("kvadratin sahəsi-${area}")


//2)3 ədəd variable yaradın.Daha sonra həmin variablelerin ortaq məxrəcini tapıb ekranda çap edin
    var number1=30
    var number2=40
    var number3=7
    var avarage=(number1+number2+number3)/3
    println("ortaq məxrəc-${avarage}")

//3)Ad ,yaş və iş yeri olub olmadığını saxlayan dəyərlər yaradılsın.Daha sonra bunlar ekranda çap edilsin. Bu proses 2 dəfə olsun, 1-ində type
//safety olacaq 1-inde olmayacaq.

   // -----versio1
//    var firstName="Zümrüd"
//    var lastName="Baxşalıyeva"
//    var isWorking=true
//    println("firstName-${firstName}")
//    println("lastName-${lastName}")
//    println("isWorking-${isWorking}")
    // -----versio2
    var firstName:String="Zümrüd"
    var lastName:String="Baxşalıyeva"
    var isWorking:Boolean=true
    println("firstName-${firstName}")
    println("lastName-${lastName}")
    println("isWorking-${isWorking}")
}
