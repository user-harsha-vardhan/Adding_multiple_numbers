fun main() {
    println("How many numbers will you enter:")
    val input = readln().toIntOrNull() ?: 0
    var number = 0
    val listOfNumber = mutableListOf<Int>()
    var sum = 0

    while (number < input) {
        println("enter the number #${number + 1}")
        val addNumber = readln().toIntOrNull() ?: continue
        sum += addNumber
        number++
        listOfNumber += addNumber
    }
    println("the numbers entered are: $listOfNumber")
    println("the total of entered numbers is $sum")

}