package ders6

fun main() {
    val gun = 3
    when (gun) {
        1 -> println("pazartesi")
        2 -> println("salı")
        3 -> println("çarşamba")
        4 -> println("perşembe")
        5 -> println("cuma")
        else -> println("Hatalı giriş")
    }
}