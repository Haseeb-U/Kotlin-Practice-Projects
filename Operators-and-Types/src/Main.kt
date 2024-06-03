//Task: Learn about operators and types
//Kotlin uses +, -, * and / for plus, minus, times and division. Kotlin also supports different number types, such as Int, Long, Double, and Float.

fun main(){



//    Step 1: Explore numeric operators
//    BELOW ARE SOME POSSIBLE WAYS TO PERFORM OPERATIONS

    println(5.0*50)
    println(5.0+50)
    println(5.0-50)
    println(5.0/50)
    println()
    println(5.0.times(50))
    println(5.0.plus(50))
    println(5.0.minus(50))
    println(5.0.div(50))
    println("\n\n\n")



//    Step 2: Practice using types

//    Kotlin does not implicitly convert between number types, so you can't assign a short value directly to a long variable, or a Byte to an Int. This is because implicit number conversion is a common source of errors in programs. You can always assign values of different types by casting.

    var v1: Int = 1
    var v2: Byte = v1.toByte()
    println("value of v2: " + v2)
    var v3: String = v1.toString()
    println("value of v3: " + v3)
    var v4: Double = v1.toDouble()
    println("value of v4: " + v4)



//    Step 3: Learn the value of variable types

//    Kotlin supports two types of variables: changeable and unchangeable. With val, you can assign a value once. If you try to assign something again, you get an error. With var, you can assign a value, then change the value later in the program.

//    The type you store in a variable is inferred when the compiler can figure it out from context. If you want, you can always specify the type of a variable explicitly, using the colon notation.

    val v5 = "hi"
    println("\n\n\n value of v5 is : " + v5)



//Step 4: Learn about strings

//    Strings in Kotlin work pretty much like strings in any other programming language using " for strings and ' for single characters, and you can concatenate strings with the + operator. You can create string templates by combining them with values; the $variable name is replaced with the text representing the value. This is called variable interpolation.

    val v6 = 5
    val v7 = 3
    println("\n\n\nI have $v6 \$fishes")
    println("I have ${v6 + v7} fishes")

}