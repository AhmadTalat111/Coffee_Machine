import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val req = scanner.next().first()
    val isReq: Boolean = req.isUpperCase() || req in '\u0031'..'\u0039'
    println(isReq)
}