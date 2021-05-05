fun main() {
    // put your code here
    val length = readLine()!!.toInt()

    var maxElemDivisibleByFor = 0

    repeat(length) {
        val current = readLine()!!.toInt()
        if (current % 4 == 0 && current > maxElemDivisibleByFor) maxElemDivisibleByFor = current
    }

    print(maxElemDivisibleByFor)
}