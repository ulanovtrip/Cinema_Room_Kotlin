package cinema


fun main() {
    val symbol = readLine()!!.first()

    val digits = "[1-9]".toRegex()
    val bigLetters = "[A-Z]".toRegex()

    if (symbol.isDigit()) {
        if (symbol.toString().matches(digits)) {
            print(true)
        } else {
            print(false)
        }
    } else if (symbol.isLetter()) {
        if (symbol.toString().matches(bigLetters)) {
            print(true)
        } else {
            print(false)
        }
    }
}