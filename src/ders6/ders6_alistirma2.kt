package ders6

fun main() {
    print("Lüfen sepet tutarını giriniz: ")
    val tutar = readln().toDoubleOrNull()
    if (tutar != null) {
        when(tutar) {
            in 0.0..99.99 -> {
                val sepetTutari = 30.0
                println("Toplam ödeyeceğiniz tutar: ${tutar+sepetTutari}")
            }
            in 100.0..299.99 -> {
                val sepetTutari = 15.0
                println("Toplam ödeyeceğiniz tutar: ${tutar+sepetTutari}")
            }
            in 300.0..Double.MAX_VALUE -> {
                println("Kargo ücreti yok ödeyeceğiniz tutar $tutar.")
            }else ->
                println("Sepet tutarı negatif olamaz.")

        }
    }else
        println("geçerli bir sayı giriniz.")

}