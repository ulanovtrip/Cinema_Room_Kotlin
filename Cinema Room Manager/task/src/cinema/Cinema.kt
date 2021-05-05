package cinema

var purchasedTickets = 0
var persentage: Double = 0.0
var currentIncome = 0
var totalIncome: Int = 0

fun main() {

    // empty array
    var cinema = arrayOf<Array<String>>()

    println("Enter the number of rows:")
    val rows: Int = readLine()!!.toInt()

    println("Enter the number of seats in each row:")
    val seats: Int = readLine()!!.toInt()

    val numberOfSeats = rows * seats

    // count start total income
    countTotalIncome(numberOfSeats)

    // fill array by S
    for (i in 1..rows) {
        var array = arrayOf<String>()
        for (j in 1..seats) {
            array += "S"
        }
        cinema += array
    }

    // menu
    showMenu(rows, seats, numberOfSeats, cinema)
}

fun countTotalIncome(numberOfSeats: Int) {
    var price = 0

    if (numberOfSeats < 60) {
        price = 10
        totalIncome = numberOfSeats * price
    } else {
        totalIncome = (numberOfSeats / 2) * 8 + (numberOfSeats / 2 * 10)
    }
}

fun showMenu(rows: Int, seats: Int, numberOfSeats: Int, cinema: Array<Array<String>>) {
    var flag: Boolean = true
    while (flag) {
        println()
        println("1. Show the seats")
        println("2. Buy a ticket")
        println("3. Statistics")
        println("0. Exit")

        val action = readLine()!!.toInt()

        when (action) {
            1 -> drawSeats(seats, cinema)
            2 -> {
                var flag = false
                while (!flag) {
                    flag = buyATicket(rows, numberOfSeats, cinema)
                }
            }
            3 -> showStatistics()
            0 -> flag = false
            else -> {
                println()
                println("Wrong input!")
            }
        }
    }
}

fun showStatistics() {
    println()
    println("Number of purchased tickets: $purchasedTickets")
    println("Percentage: ${"%.2f".format(persentage)}%")
    println("Current income: $$currentIncome")
    println("Total income: $$totalIncome")
}

private fun buyATicket(rows: Int, numberOfSeats: Int, cinema: Array<Array<String>>): Boolean {
    println()
    println("Enter a row number:")
    val row = readLine()!!.toInt()
    println("Enter a seat number in that row:")
    val seat = readLine()!!.toInt()

    if (row > rows || seat > numberOfSeats / rows) {
        println("Wrong input!")
        return false
    }

    val result = update(row, seat, rows, cinema)
    if (result) {
        currentIncome += countPriceOfTicket(rows, row, numberOfSeats)
        purchasedTickets++
        persentage = purchasedTickets.toDouble() / numberOfSeats.toDouble() * 100
        return true
    } else {
        return false
    }
}

fun countPriceOfTicket(rows: Int, row: Int, numberOfSeats: Int): Int {
    var price = 0

    if (numberOfSeats < 60) {
        price = 10
        totalIncome = numberOfSeats * price
    } else {
        price = if (row <= rows / 2) {
            10
        } else {
            8
        }
    }

    println()
    println("Ticket price: $$price")
    return price
}

fun update(row: Int = 0, seat: Int = 0, rows: Int = 0, cinema: Array<Array<String>>): Boolean {
    for (i in 0..rows) {
        for (j in 0..seat) {
            if (i == row && j == seat) {
                if (cinema[i - 1][j - 1].equals("B")) {
                    println()
                    println("That ticket has already been purchased!")
                    return false
                } else {
                    cinema[i - 1][j - 1] = "B"
                }
            }
        }
    }
    return true
}

fun drawSeats(seats: Int, array: Array<Array<String>>) {
    println()
    println("Cinema:")
    var numberSeats = 1
    print(" ")
    repeat(seats) {
        print(" $numberSeats")
        numberSeats += 1
    }
    println()

    var countOfRows = 1
    for (innerArray in array) {
        print("${countOfRows++} ")
        for (value in innerArray) {
            print("$value ")
        }
        println()
    }
}