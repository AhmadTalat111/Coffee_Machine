import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var rep = scanner.nextInt()
    var num = 1
    var counter = 0
    while (counter <= rep ){
        repeat(num){
            print("$num ")
            counter++
            if( counter == rep) return
        }

        num++

       // rep--
    }

}
//
//do {
//    repeat(num) {
//        print("$num ")
//    }
//
//    num++
//    rep--
//} while ( num <= rep )