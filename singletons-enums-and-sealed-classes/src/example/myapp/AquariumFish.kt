package example.myapp

abstract class AquariumFish{
    abstract val color : String
}

class Shark : AquariumFish(), FishAction{
    override val color : String = "Gray"

    override fun eat(){
        println("Hunt and eat Fish")
    }
}

class Plecostomus : AquariumFish(), FishAction{
    override val color : String = "Gold"

    override fun eat(){
        println("eat algae")
    }
}

interface FishAction{
    fun eat()
}