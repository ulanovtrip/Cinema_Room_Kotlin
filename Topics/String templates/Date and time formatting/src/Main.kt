fun main() {
    // write your code here
    val (hh, mm, ss) = readLine()!!.split(" ")
    val (day, month, year) = readLine()!!.split(" ")

    print("$hh:$mm:$ss $day/$month/$year")
}