import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val age = scanner.nextInt()
    val canWork = age in 18..59
    println(canWork)
}
