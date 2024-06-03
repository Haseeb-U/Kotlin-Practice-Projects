//Task: Learn about nullability
//Nullable versus non-nullable variables. Programming errors involving nulls have been the source of countless bugs. Kotlin seeks to reduce bugs by introducing non-nullable variables.

fun main(){

//    Step 1: Learn about nullability

//    cannot Declare an Int and assign null to it. like : var rocks: Int = null

//    Use the question mark operator, ?, after the type to indicate that a variable can be null. Declare an Int? and assign null to it.
    var marbles: Int? = null
    println(marbles)

//    When you have complex data types, such as a list:
//      You can allow the elements of the list to be null.
//      You can allow for the list to be null, but if it's not null its elements cannot be null.
//      You can allow both the list or the elements to be null.



//    Step 2: Learn about the ? and ?: operators

//    You can test for null with the ? operator, saving you the pain of writing many if/else statements.
    println("\n\n\n")
    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
        fishFoodTreats--
    }
    println(fishFoodTreats)

    println("\n\n\n")
    fishFoodTreats = fishFoodTreats?.dec() ?: 0
    println(fishFoodTreats)

//    It's shorthand for "if fishFoodTreats is not null, decrement and use it; otherwise use the value after the ?:, which is 0." If fishFoodTreats is null, evaluation is stopped, and the dec() method is not called.




}