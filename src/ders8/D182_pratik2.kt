package ders8

fun main() {
    var secim: String
    do {
        println("Oyun bitti tekrar oynamak ister misiniz: ")
        var secim = readln().trim().lowercase()
    }while (secim == "e")
    println("Uygulama kapatıldı.")
}