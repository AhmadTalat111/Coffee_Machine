import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val letter1 = scanner.next().first()
    val letter2 = scanner.next().first()
    val areSame = letter1 == letter2 || letter1.toUpperCase() == letter2 || letter1.toLowerCase() == letter2
    println(areSame)
}
