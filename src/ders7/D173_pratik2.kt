package ders7

fun main() {
    for (i in 1..5) {
        print("$i. ismi giriniz: ")
        val isim = readln()
        println("$i. isim $isim")
    }
    for(i in 1..3){
        print("$i. sayıyı giriniz: ")
    val sayi = readln().toInt()
    println("$i. sayının karesi: ${sayi*sayi}")
    }
}