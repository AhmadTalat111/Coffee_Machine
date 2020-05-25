import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val colorInput = input.next().toUpperCase()
    println(colorInput.isRainbow())


}
enum class Rainbow(val color: String) {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet");
    fun isRainbow(color: String)  {
        for (enum in Rainbow.values()) {
            if (color.toUpperCase() == enum.name) println(color)
        }

    }
}