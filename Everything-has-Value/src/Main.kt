fun main(){
    // Will assign kotlin.Unit
    val isUnit = println("This is an expression")
    println(isUnit)

    println("\n\n\n")

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)


    println("\n\n\n")

    val temperature2 = 52
    val isHot2 = temperature2 > 50
    println(isHot2)

    println("\n\n\n")
    val temperature3 = 10
    val message = "The water temperature is ${ if (temperature3 > 50) "too warm" else "OK" }."
    println(message)

}