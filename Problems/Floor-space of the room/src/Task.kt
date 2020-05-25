import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val bi: Double = 3.14
    when (scanner.next()) {
        "triangle" -> {
            val a = scanner.nextDouble()
            val b = scanner.nextDouble()
            val c = scanner.nextDouble()
            val s: Double = (a + b + c) / 2
            println(sqrt(s * (s - a) * (s - b) * (s - c)))
        }
        "rectangle" -> {
            val a = scanner.nextDouble()
            val b = scanner.nextDouble()
            println(a * b)
        }
        "circle" -> {
            val r = scanner.nextDouble()
            println(r * r * bi)
        }
    }
}
