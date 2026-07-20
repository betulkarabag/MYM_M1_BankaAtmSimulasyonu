package ders6

fun main() {
    val gizemliObje: Any = "Merhaba Kotlin"
    when (gizemliObje) {
        is String -> println("Bu bir String ifadedir. uzunluğu: ${gizemliObje.length}")
        is Int -> println("Bu bir tam sayıdır.Bu sayının karesi: ${gizemliObje * gizemliObje}")
    }
}