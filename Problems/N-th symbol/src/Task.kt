import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val str = scanner.nextLine()
    val num = scanner.nextInt()
    val adj = num - 1
    println("Symbol # $num of the string \"$str\" is '${str.get(adj)}'")
}
