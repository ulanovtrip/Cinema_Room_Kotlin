fun main() {
    // write your code here
    val (a, b, c, d, e) = List(5) { readLine()!!.toInt() }
    val range1 = a..b
    val range2 = c..d

    print(e in range1 || e in range2)
}