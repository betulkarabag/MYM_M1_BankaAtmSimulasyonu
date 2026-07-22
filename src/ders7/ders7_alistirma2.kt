package ders7

fun main() {
     print("Bir tamsayı giriniz: ")
    val sayi = readln().toInt()
    var sonuc = 1
    for (i in sayi downTo 1) {
        sonuc *= i
    }
    println(sonuc)
}