import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val charOne = scanner.next().first()
    val charTwo = scanner.next().first()
    val charThree = scanner.next().first()
    val areOrdered = charOne + 1 == charTwo && charTwo + 1 == charThree
    println(areOrdered)
}