package ders6

fun main() {
    val kullaniciAdi = "admin"
    val sifre = "1234"
    when {
        kullaniciAdi == "" -> println("Hata! kullanıcı adı boş bırakılamaz.")
        sifre == "" -> println("Hata! şifre alanı boş bırakılamaz.")
        kullaniciAdi =="admin" && sifre == "1234" -> println("Giriş başarılı.")
        else -> println("Girilen kullanıcı adı veya şifre yanlış")


    }
}