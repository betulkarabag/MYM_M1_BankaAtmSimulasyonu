package ders7

fun main() {
    for (i in 1..5){
        print("Mesajınızı girin: ")
        val mesaj = readln()
        val temizMesaj = mesaj.trim().lowercase()
        if (mesaj.contains("bedava") ||
            mesaj.contains("kazandınız")||
            mesaj.contains("kampanya")){
            println("Spam mesajı engellendi.")
        }else
            println("Mesaj gönderildi: $temizMesaj")


    }




}