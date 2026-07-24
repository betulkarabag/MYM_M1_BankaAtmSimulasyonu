package ders8

fun main() {
    for (i in 1..10) {
        println(i)
        if(i==5) {
            println("Araman bulundu döngü kapatılıyot.")
            break
        }
    }

    var secim : String
    while (true){
        print("Seçimini yap")
        secim = readln()
        if (secim == "h") break
    }
}