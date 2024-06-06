 package example.myapp

fun makeFish(){
    val plecostomus = Plecostomus()
    println("plecostomus color is : ${plecostomus.color}")
    plecostomus.eat()
    val shark = Shark()
    println("shark color is : ${shark.color}")
    shark.eat()
}

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

    val myAquarium6 = Aquarium(length = 25 , width = 25, height = 40)
    myAquarium6.printSize()

    val myTower = TowerTank(height = 40, diameter = 25)
    myTower.printSize()

}

fun main(){
    makeFish()
}