package ders9

fun main() {
    print("Adınızı girin: ")
    val ad = readln()
    var soyAd: String? = null
    var yas: Int? =  null
    print("Soyadınızı girin: ")
    soyAd = readln()
    var gosterilecekSoyad = soyAd ?: "Soyadı belirtilmemiş"
    print("Yaşınızı girin: ")
    yas = readln().toIntOrNull()
    var gosterilecekYas = yas ?: 0


    println("Merhaba $ad $gosterilecekSoyad yaşınız: $gosterilecekYas")
}