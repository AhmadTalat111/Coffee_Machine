import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextInt()
    if (input % 2 == 0) {
        println("Divided by 2")
        if (input % 3 == 0) {
            println("Divided by 3")
        }
        if (input % 5 == 0) {
            println("Divided by 5")
        }
        if (input % 6 == 0) {
            println("Divided by 6")
        }
    } else if (input % 3 == 0) {
        println("Divided by 3")
        if (input % 2 == 0) {
            println("Divided by 0")
        }
        if (input % 5 == 0) {
            println("Divided by 5")
        }
        if (input % 6 == 0) {
            println("Divided by 6")
        }
    } else if (input % 5 == 0) {
        println("Divided by 5")
        if (input % 2 == 0) {
            println("Divided by 0")
        }
        if (input % 3 == 0) {
            println("Divided by 3")
        }
        if (input % 6 == 0) {
            println("Divided by 6")
        }
    } else if (input % 6 == 0) {
        println("Divided by 6")
        if (input % 2 == 0) {
            println("Divided by 0")
        }
        if (input % 3 == 0) {
            println("Divided by 3")
        }
        if (input % 5 == 0) {
            println("Divided by 5")
        }
    }
}