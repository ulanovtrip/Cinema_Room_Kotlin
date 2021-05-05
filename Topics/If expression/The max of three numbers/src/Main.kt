fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(
        if (a!! > c!!) {
            // put your code here
            if (a > b) a else b
        } else {
            // and here
            if (c > b) c else b
        }
    )
}