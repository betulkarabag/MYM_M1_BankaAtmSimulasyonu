package ders8

fun main() {
    var sifre: String
    do {
        print("Şifrenizi girin: ")
        sifre = readln()
        if (sifre != "12345") println("Şifre yanlış tekrar deneyin")

    }while (sifre != "12345")
    println("Sisteme giriş yapıldı.")
}