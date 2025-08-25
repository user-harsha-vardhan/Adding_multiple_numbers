fun main() {
    println("enter the total numbers to add:")
    val input = readln().toIntOrNull() ?: 0
    var number = 0

    var sum = 0

    while (number < input) {
        println("enter the number #${number + 1}")
        val firstNumber = readln().toIntOrNull() ?:0
        sum += firstNumber
        number++
    }
        println("the total of three numbers is $sum")

}