import java.util.*
fun square (num: Int): Int = num * num
// write your code here

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    println(square(number))
}