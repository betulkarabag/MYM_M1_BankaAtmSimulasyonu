package ders6

fun main() {
    print("Yaşınızı giriniz: ")
    val yas = readln().toIntOrNull()
    if (yas != null) {
        val sonuc = when (yas){
            in 0..6 -> "Ücretsiz giriş"
            in 7..18 -> "öğrenci tarifesi: 50 TL"
            in 19..64 -> "Yetişkin tarifesi: 100TL"
            in 65..120 -> "Emekli indirimi 40 TL"
            else -> "Geçersiz yaş"
        }
println(sonuc)




    }else
        println("Lütfen yaşınızı rakamlarla giriniz.")
}