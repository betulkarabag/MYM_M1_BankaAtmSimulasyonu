package ders6

fun main() {
    val biletSinifi = "B"
    val sinifAciklamasi =
        when (biletSinifi) {
            "E" -> "Ekonomi Sınıfı"
            "B" -> "Business Class"
            "F" -> "First Class"
            else -> "Geçersiz sınıf"
        }
            println("Bilet sınıfınız: $sinifAciklamasi")

}