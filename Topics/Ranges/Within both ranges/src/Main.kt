fun main() {
    // write your code here
    val (a, b, c, d, e) = List(5) { readLine()!!.toInt() }

    val rangeOne = a..b
    val rangeTwo = c..d
    print(e in rangeOne && e in rangeTwo)
}
