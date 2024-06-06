package example.myapp

class Aquarium(var width : Int = 20, var height : Int = 40, var length : Int = 100) {
//    var width : Int = width
//    var height : Int = height
//    var length : Int = length
    var volume : Int
        get() = (width * height * length) / 1000
        set(value) {
            height = (value * 1000)/ (width * length)
        }

    init {
        println("Aquarium is Initializing")
    }
//    init {
//        println("Volume : ${(width * height * length) / 1000} L")
//    }

    fun  printSize(){

        println("Width : $width \n Height : $height \n" +
                " Length : $length \n\n" +
                " Volume : $volume")
    }
}