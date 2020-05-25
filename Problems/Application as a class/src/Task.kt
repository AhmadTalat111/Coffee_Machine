class Application(val name: String) {
    fun run(array: Array<String>) {
        println(this.name)
        for (item in array){
            println(item)
        }
    }
}
//fun main(){
//    val app = Application("app")
//    val array = arrayOf("ss", "dd", "ll")
//    app.run(array)
//}