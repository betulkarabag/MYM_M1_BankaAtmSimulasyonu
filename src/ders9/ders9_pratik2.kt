package ders9

fun main() {
    print("Kargo numaranız nedir: ")
    val kargoNo: String? = readln()
    if (kargoNo != null) {
        println("Kargo numaranızın uzunluğu: ${kargoNo.length}")
    }else{
        println("Kargonuz henüz yola çıkmadı.")
    }
}