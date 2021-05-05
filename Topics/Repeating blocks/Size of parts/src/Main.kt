fun main() {
    // put your code here
    val length = readLine()!!.toInt()

    var perfect = 0
    var lager = 0
    var rejections = 0

    repeat(length) {
        when (readLine()!!.toInt()) {
            0 -> {
                perfect++
            }
            1 -> {
                lager++
            }
            -1 -> {
                rejections++
            }
        }
    }

    print("$perfect $lager $rejections")
}