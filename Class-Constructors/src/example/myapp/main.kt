 package example.myapp

fun buildAquaruim(){
    val myAquarium1 = Aquarium()
    myAquarium1.printSize()
    val myAquarium2 = Aquarium(width = 5)
    myAquarium2.printSize()
    val myAquarium3 = Aquarium(height = 2, length = 3)
    myAquarium3.printSize()
    val myAquarium4 = Aquarium(length = 3, height = 2, width = 1)
    myAquarium4.printSize()

    val myAquarium5 = Aquarium()
    myAquarium5.printSize()
    myAquarium5.volume = 70
    myAquarium5.printSize()

}

fun main(){
    buildAquaruim()
}