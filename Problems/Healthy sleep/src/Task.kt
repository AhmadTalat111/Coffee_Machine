import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val h = scanner.nextInt()
    if (h >= a && h < b) {
        println("Normal")
    } else if (h < a) {
        println("Deficiency")
    } else if (h > b) {
        println("Excess")
    }
}
