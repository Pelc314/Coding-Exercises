package src

fun main() {

    var Uzytkownik = User("Maciej", age = 23)
    Uzytkownik.printName()
}

//=====================================================


class User(name: String = "no name", var age: Int) {
    val name: String

    init {
        if (name.isBlank()) {
            this.name = " no name"
        } else {
            this.name = name.trim()
        }
        println("New user created ${this.name}, age :${age}")
    }

    fun printName(printedName: String = name) {
        println("My name is ${printedName}")
    }
}