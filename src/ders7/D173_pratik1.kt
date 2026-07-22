package ders7

fun main() {
    println("*-* Kredi kartı kullanım yıllarınız *-*")
    for(yıl in 2026 until 2036){
        println(yıl)
    }
    for (i in 20 downTo 0 step 2){
        print(i)
    }
    for(i in 'a'..'f') {
        print(i)
    }
    val turkceHarfler = "abcçdefgğhıijklmnoöprsştuüvyz"
    for (i in turkceHarfler) {
        println(i)
    }

}