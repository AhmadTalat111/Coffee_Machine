import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val digit = scanner.next()
    val list = digit.toList().reversed()
    print(list[0])

}