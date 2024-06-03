//Task: Compare conditions and booleans
//Kotlin has booleans and boolean operators such as less than, equal to, greater than, and so on (<, ==, >, !=, <=, >=).

fun main(){


//    Write an if/else statement.
    val numberOfFish = 50
    val numberOfPlants = 23
    if (numberOfFish > numberOfPlants) {
        println("Number of fish is greater")
    } else {
        println("Number of plants is greater")
    }



//    Try a range in an if statement. In Kotlin, the condition you test can use ranges, too.
    val fish = 50.0
    if (fish in 1.0..100.0) {
        println("\n\n\nnumber of fish : " + fish)
    }



//    Write an if with multiple cases. For more complicated conditions, use logical and && and logical or ||. As in other languages, you can have multiple cases by using else if.
    println("\n\n\n")
    if (numberOfFish == 0) {
        println("Empty tank")
    } else if (numberOfFish < 40) {
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }



//    Try out a when statement. There's a nicer way to write that series of if/else if/else statements in Kotlin, using the when statement, which is like the switch statement in other languages. Conditions in a when statement can use ranges, too.
    println("\n\n\n")
    when (numberOfFish) {
        0  -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }


}