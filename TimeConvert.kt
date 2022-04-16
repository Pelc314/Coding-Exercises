package src
fun main() {
    val input = 6271
    var output = timeConvert(input)
    println(output)
}

fun timeConvert(number: Int): String {
    var hours = number / 60
    var minutes = number % 60
    var hour = "${hours.toString()}:${minutes.toString()}"

    return hour
}
