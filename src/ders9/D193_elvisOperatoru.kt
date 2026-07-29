package ders9

fun main() {
    var kullaniciAdi: String? = null
    var gosterilecekIsim = kullaniciAdi ?: "Misafir"
    println("Merhaba. $gosterilecekIsim")
    if (gosterilecekIsim != null) {
        println("Merhaba, $gosterilecekIsim")
    }else{
        println("Merhaba, misafir")
    }
    // ikinci örnek
    val mesaj: String? = "Selam"

}