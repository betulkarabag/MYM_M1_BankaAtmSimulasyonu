package ders6

fun main() {
    print("Metninizi giriniz: ")
    val metin = readln().trim().lowercase()
    when {
        metin == "merhaba" -> println("size de merhaba")
        metin == "saat kaç" -> println("saat 14.00")
        metin.contains("hava") -> println("Dışarıda harika bir hava var")
        else ->
            println("Ne demek istediğinizi anlayamadım")
    }

}