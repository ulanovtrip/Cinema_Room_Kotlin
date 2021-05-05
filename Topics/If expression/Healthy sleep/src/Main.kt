fun main() {
    // write your code here
    val (min, max, H) = List(3) { readLine()!!.toInt() }

    if (H >= min && H <= max) {
        print("Normal")
        return
    }

    if (H >= max) {
        print("Excess")
        return
    }

    if(H <= min) {
        print("Deficiency")
        return
    }
}