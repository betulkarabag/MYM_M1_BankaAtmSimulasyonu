package ders9

fun main() {
    var ikinciIsim: String? = "Can"
    println(ikinciIsim?.length)
    if (ikinciIsim != null) {
        println(ikinciIsim.length)
    }else{
        println(null)
    }

}