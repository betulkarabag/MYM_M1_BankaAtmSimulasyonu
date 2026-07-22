package ders7

fun main() {
     println("Bir sayı giriniz: ")
    val sayi = readln().toInt()
    for (i in 1..10){
        println("$sayi x $i = ${sayi*i}")
    }
}