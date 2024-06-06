package example.myapp

import kotlin.math.PI


open class Aquarium(open var width : Int = 20, open var height : Int = 40, open var length : Int = 100) {
//    var width : Int = width
//    var height : Int = height
//    var length : Int = length
    open var volume : Int
        get() = (width * height * length) / 1000
        set(value) {
            height = (value * 1000)/ (width * length)
        }

    open val shape = "rectangle"

    open var water : Double = 0.0
        get() = volume * 0.9

    init {
        println("Aquarium is Initializing")
    }
//    init {
//        println("Volume : ${(width * height * length) / 1000} L")
//    }

    fun  printSize(){

        println("Width : $width \n " +
                "Height : $height \n" +
                " Length : $length \n\n" +
                " Volume : $volume\n\n" +
                "Shape : $shape\n" +
                "Volume : $volume , Water : $water (${water/volume*100}% full)\n\n")
    }
}





class TowerTank (override var height: Int, var diameter: Int): Aquarium(height = height, width = diameter, length = diameter){
    override var volume: Int
        get() = (width/2 * length/2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width/2 * length*2)).toInt()
        }

    override var water: Double = volume * 0.8
        get() = volume * 0.8

    override val shape: String = "Cylinder"

}