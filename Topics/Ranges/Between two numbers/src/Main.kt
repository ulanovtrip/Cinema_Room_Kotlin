fun main() {
    // write your code here
    val (a, b, c) = List(3) { readLine()!!.toInt() }

    val resul = if (a in b..c) true else false
    print(resul)
}