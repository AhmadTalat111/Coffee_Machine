import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    val nextNumber = number + 1
    if (nextNumber % 2 == 0) {
        println(nextNumber)
    } else {
        println(nextNumber + 1)
    }
}