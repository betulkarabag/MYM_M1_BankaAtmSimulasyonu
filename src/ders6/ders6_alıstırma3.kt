package ders6

fun main() {
    val gelenVeri: Any = 5
    when (gelenVeri) {
        is String -> println("Metin uzunluğu: ${gelenVeri.length}")
        is Int -> println("Sayının 10 katı: ${gelenVeri * 10}")
        is Boolean -> println("Durum Doğru")
        else -> println("Desteklenmeyen veri tipi")
    }
}