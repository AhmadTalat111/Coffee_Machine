import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val hr1 = scanner.nextInt() * 60 * 60
    val min1 = scanner.nextInt() * 60
    val sec1 = scanner.nextInt()
    val hr2 = scanner.nextInt() * 60 * 60
    val min2 = scanner.nextInt() * 60
    val sec2 = scanner.nextInt()
    print(hr2 - hr1 + (min2 - min1) + (sec2 - sec1))
}
