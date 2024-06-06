class Main{

    var volume: Int
        get() = 10 * 10 * 10 / 1000
        private set(value) {
            volume = (value * 1000) / (10 * 10)
        }

}


fun main(){
    val Main = Main()
    println(Main.volume)
}