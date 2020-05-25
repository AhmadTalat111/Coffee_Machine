import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var num = scanner.nextInt()
    var largest = 0
    while (num != 0 ){


        if (num > largest){
            largest = num
        }
        num = scanner.nextInt()
    }
    println(largest)
}