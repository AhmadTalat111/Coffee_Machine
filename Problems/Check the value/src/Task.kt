import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    val highest = 10
    val lessthanHighest = num < highest
    println(lessthanHighest)
}