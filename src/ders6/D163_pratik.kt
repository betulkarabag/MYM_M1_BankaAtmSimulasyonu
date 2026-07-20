package ders6

fun main() {
    val can = 100
    when (can) {
        0 -> println("Karakter öldü")
        1,2,3 -> println("Kritik seviye hemen iksir için")
        in 4..50 -> println("Tehlikedesiniz savunmada kalın")
        in 50..100 -> println("Sağlığınız yerinde savaşmaya devam")
        else -> println("Geçersiz değer.")

    }
}