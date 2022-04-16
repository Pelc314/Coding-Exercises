package src

fun main() {
    val input = "kajak"
    var output = palin(input)
    println(output)
}

fun palin(verb: String): Boolean {
    var isPalin = false

    var testVerb = verb.reversed()
    if (testVerb == verb) isPalin = true

    return isPalin
}