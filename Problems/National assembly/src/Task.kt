import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val pop = scanner.nextLong()
    val numOfP = Math.cbrt(pop.toDouble())
    println(numOfP.toInt())
}