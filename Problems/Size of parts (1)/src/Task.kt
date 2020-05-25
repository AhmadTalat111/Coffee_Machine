import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var perfect = 0
    var larger = 0
    var smaller = 0
    repeat(scanner.nextInt()){
        when(scanner.nextInt()){
            0 -> perfect++
            1 -> larger++
            -1 -> smaller++
        }
    }
println("$perfect $larger $smaller")
}