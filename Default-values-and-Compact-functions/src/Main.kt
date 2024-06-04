import java.util.Random

fun main(){
    swim()
    swim("slow")
    swim(speed = "very fast")

    println("\n\n")
    feedTheFish()
}

fun swim(speed : String = "fast"){
    println("Fish swimming $speed")
}

fun  shouldChangeWater(day: String, temperature : Int = 22, dirty : Int = 20) = temperature > 30 || day == "Sunday" || dirty > 30



//
//fun shouldChangeWater(day : String, temperature : Int = 22, dirty : Int = 20) : Boolean{
//    return when {
//        temperature > 30 -> true
//        day == "Sunday" -> true
//        dirty > 30 -> true
//        else -> false
//    }
//}



















fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    println("Change Water : ${shouldChangeWater(day = day)}")
}

fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood(day : String) : String{
//    val food = when(day){
//        "Monday" -> "flakes"
//        "Tuesday" -> "pellets"
//        "Wednesday" -> "redworms"
//        "Thursday" -> "granules"
//        "Friday" -> "mosquitoes"
//        "Saturday" -> "lettuce"
//        else -> "plankton"
//    }
//    return food


//    val food : String
//    when(day){
//        "Monday" -> food = "flakes"
//        "Tuesday" -> food = "pellets"
//        "Wednesday" -> food = "redworms"
//        "Thursday" -> food = "granules"
//        "Friday" -> food = "mosquitoes"
//        "Saturday" -> food = "lettuce"
//        else -> food = "plankton"
//    }
//    return food

    return when(day){
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        else -> "plankton"
    }

}