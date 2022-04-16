package src

fun main() {
    val input: Array<Int> = arrayOf(5, 7, 9, 11, 13, 15, 17, 19)
    var output = arithGeo(input)
    println(output)
}

fun arithGeo(tablica: Array<Int>): String {
    var result = "random sequence"
    //println(tablica[tablica.size])
    for (i in 0..tablica.size - 2) {
        if (2 + tablica[i] == tablica[i + 1]) {
            result = "Arithmetic sequence"
        } else if (tablica[i] * 3 == tablica[i + 1]) {
            result = "Geometric sequence"
        } else {
            result = "random sequence"
            break
        }
    }
    return result
}