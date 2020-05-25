import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val reeses = scanner.nextInt()
    val isWeekend: Boolean = scanner.nextBoolean()
    val isSuccessful: Boolean = true

    if(isWeekend && reeses in 15 .. 25){
        println(isSuccessful)
    } else if(!isWeekend && reeses in 10..20){
        println(isSuccessful)
    }else{
        println(!isSuccessful)
    }





}