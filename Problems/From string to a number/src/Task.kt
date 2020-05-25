import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val str = scanner.next()
    var i = when(str){
        "one" -> 1
        "two"-> 2
        "three"-> 3
        "four"-> 4
        "five"-> 5
        "six"-> 6
        "seven"-> 7
        "eight"-> 8
        else -> 9
            }
    println(i)
}
