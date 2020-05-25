import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val duration = scanner.nextInt()
    val foodCost = scanner.nextInt()
    val fligtCost = scanner.nextInt()
    val nightCost = scanner.nextInt()
    val total = (duration * foodCost) + (fligtCost * 2) +
            ((duration - 1) * nightCost)
    println(total)
}