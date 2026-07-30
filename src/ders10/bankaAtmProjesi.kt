package ders10

fun main() {
    val dogruSifre = "1234"
    var bakiye = 1000.0
    var hak = 3

    println("---KOTLİN BANKASINA HOŞGELDİNİZ---")

    DisDongu@while (hak > 0) {
        print("4 haneli şifrenizi girin: ")
        val girilenSifre = readln().trim()

        if (girilenSifre != dogruSifre) {
            hak--
            if (hak > 0) {
                println("Hatalı şifre! Tekrar deneyiniz. Kalan hakkınız: $hak")
            } else {
                println("Kartınız bloke edilmiştir!")
                break
            }

        } else {
            println("Giriş başarılı.\n")



            println("Hoşgeldiniz, seçiminizi yapın.")

            do {
                println(
                    """
 ............................
 1. Bakiye Sorgulama💵💶💷💴
 2. Para Yatırma🤑🏦💰🤝
 3. Para Çekme💸💸💸
 4. Çıkış 👋👉
 ----------------------
 """.trimIndent()
                )
                print("Seçiminiz: ")
                val secim = readln().trim()

                when (secim) {
                    "1" -> println("Bakiyeniz: $bakiye TL\n")
                    "2" -> {
                        print("Yatıralacak tutarı girin: ")
                        val tutar = readln().toDoubleOrNull() ?: 0.0

                        if (tutar <= 0.0) {
                            println("Geçersiz Tutar Girdiniz")
                        } else {
                            bakiye += tutar
                            println("Güncel bakiyeniz: $bakiye TL\n")
                        }

                    }

                    "3" -> {
                        print("Çekilecek tutarı girin: ")
                        val cekilecekTutar = readln().toDoubleOrNull() ?: 0.0

                        if (bakiye < cekilecekTutar) {
                            println("Yetersiz Bakiye")
                        } else if (cekilecekTutar <= 0.0) {
                            println("Geçersiz Tutar Girdiniz")
                        } else {
                            bakiye -= cekilecekTutar
                            println("Güncel bakiyeniz: $bakiye TL\n")
                        }
                    }

                    "4" -> {
                        println("İyi günler dileriz")
                        break@DisDongu
                    }

                    else -> println("Geçersiz seçim! Tekrar deneyin.\n")
                }


            } while (true)

        }
    }


}

