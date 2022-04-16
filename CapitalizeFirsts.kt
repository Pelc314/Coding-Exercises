package src

fun main() {
    val input = "quick brown fox jumped over the lazy dog"
    var output = reverseString(input)
    println(output)
}

fun reverseString(word: String = "mega lol"): String {
    var newWord = word
    var words = newWord.split(' ')
    newWord = ""
    for (i in 0..words.size - 1) {
        newWord += words[i].replaceFirstChar { it.uppercase() } + " "
    }
    return newWord
}