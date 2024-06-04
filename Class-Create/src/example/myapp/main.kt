package example.myapp

fun buildAquaruim(){
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
}

fun main(){
    buildAquaruim()
}