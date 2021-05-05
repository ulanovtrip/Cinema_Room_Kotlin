fun main() {
    val firstArray = readLine()!!.split(' ').map { it }.toTypedArray()
    val secondArray = readLine()!!.split(' ').map { it }.toTypedArray()
    // do not touch the lines above
    // write your code here
    val conca = firstArray + secondArray
    print(conca.joinToString())

    val arrayMD = arrayOf(
        arrayOf('q', 'w', 'e'),
        arrayOf('r', 't', 'y')
    )

    val n = arrayOf(
        FloatArray(0),
        FloatArray(1),
        DoubleArray(2)
    )

//    val arrayMD = arrayOf(
//        arrayOf<String>(1, 2, 0),
//        arrayOf<String>(0, 2, 5),
//        arrayOf<String>(5, 1, 0)
//    )

    val arrayMD2 = arrayOf(
        arrayOf(booleanArrayOf(true, true), arrayOf(1, 1)),
        arrayOf(arrayOf(1, 1), booleanArrayOf(true, true))
    )

//    val arrayMD3 = arrayOf(
//        arrayOf(),
//        arrayOf()
//    )
}