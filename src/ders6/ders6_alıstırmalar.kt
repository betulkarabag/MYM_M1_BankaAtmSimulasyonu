package ders6

fun main() {
    print("1 ve 12 aras bir sayı giriniz: ")
    val ay =  readln().toIntOrNull()
    if ( ay == null)
        println("Lütfen geçerli bir sayı giriniz.")
    else {
        when (ay) {
            12, 2, 3 -> println("kış mevsimi")
            4, 5, 6 -> println("İlkbahar ayı")
            7, 8, 9 -> println("Yaz ayı")
            10, 11, 1 -> println("Sonbahar ayı")
            else -> println("Geçerli bir sayı giriniz.")

        }
    }
}