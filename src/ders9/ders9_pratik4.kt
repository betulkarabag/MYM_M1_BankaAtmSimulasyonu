package ders9

fun main() {
    val kuponTutari: Double? = null
    val sepetTutari = 500.0
    println("İndirimli sepet tutarı: ${sepetTutari-(kuponTutari ?: 0.0)}")

}