fun main() {
    var inputArray: Array<Array<String>> = arrayOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toTypedArray()
        inputArray += strings
    }
    // write your code here    
    val newArray = arrayOf(
        inputArray.last(),
        inputArray.first()
    )

    print(newArray.contentDeepToString())
}