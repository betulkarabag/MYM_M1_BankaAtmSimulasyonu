package ders8

fun main() {
    for (i in 1..5) {
        if (i == 3) {
            println("Bu adım atlanıyor.")
            continue
        }
        println(i)
    }
    var sayac = 0
    for (i in 1..5) {
        if (i % 2 == 0) {
            sayac++
            continue
        }
    }
    println("Çift sayı adedi: $sayac")

}