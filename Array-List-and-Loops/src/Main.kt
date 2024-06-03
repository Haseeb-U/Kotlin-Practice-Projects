///Task: Explore arrays, lists, and loops

fun main(){

//    Step 1: Make lists

//    Declare a list using listOf and print it out. This list cannot be changed.

    val school = listOf("mackerel", "trout", "halibut")
    println(school)

//    Declare a list that can be changed using mutableListOf. and then Remove an item.
    println("\n\n\n")
    val myList = mutableListOf("tuna", "salmon", "shark")
    println( myList.remove("shark") )
    println(myList)

//    Note: With a list defined with val, you can't change which list the variable refers to, but you can still change the contents of the list.



//    Step 2: Create arrays

//    Like other languages, Kotlin has arrays. Unlike lists in Kotlin, which have mutable and immutable versions, there is no mutable version of an Array. Once you create an array, the size is fixed. You can't add or remove elements, except by copying to a new array.

//    Note: With an array defined with val, you can't change which array the variable refers to, but you can still change the contents of the array.

//    Declare an array of strings using arrayOf. Use the java.util.Arrays.toString() array utility to print it out.
    println("\n\n\n")
    val school1 = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school1))
    println(school1.get(1))

//    An array declared with arrayOf doesn't have a type associated with the elements, so you can mix types, which is helpful. Declare an array with different types.

    val mix = arrayOf("fish", 2)

//    You can also declare arrays with one type for all the elements. Declare an array of integers using intArrayOf(). There are corresponding builders, or instantiation functions, for arrays of other types.

    val numbers = intArrayOf(1,2,3)

//    Note: Using an array of a primitive type such as Int or Byte avoids the overhead of boxing.

//    Combine two arrays with the + operator.

    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers
    println(foo2[0])
    println(foo2[2])
    println(foo2[5])

//    Try out different combinations of nested arrays and lists. As in other languages, you can nest arrays and lists. That is, when you put an array within an array, you have an array of arrays—not a flattened array of the contents of the two. The elements of an array can also be lists, and the elements of lists can be arrays.

    val numbers1 = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers1, oceans, "salmon")
    println(oddList)

//The first element, numbers, is an Array. When you don't use the array utility to print it, Kotlin prints the address instead of the contents of the array.

//    One nice feature of Kotlin is that you can initialize arrays with code instead of initializing them to 0.

    val array = Array (5) { it * 2 }
    println(java.util.Arrays.toString(array))

//    The initialization code is between the curly braces, {}. In the code, it refers to the array index, starting with 0.



//    Step 3: Make loops

//    Create an array. Use a for loop to iterate through the array and print the elements.
    println("\n\n\n")
    val school2 = arrayOf("shark", "salmon", "minnow")
    for (element in school2) {
        print(element + " ")
    }
    println("\n\n")

//    In Kotlin, you can loop through the elements and the indexes at the same time.

    for ((index, element) in school2.withIndex()) {
        println("Item at $index is $element\n")
    }

//    Try different step sizes and ranges. You can specify ranges of numbers or of characters, alphabetically. And as in other languages, you don't have to step forward by 1. You can step backward using downTo.

    for (i in 1..5) print(i)
    println()
    for (i in 5 downTo 1) print(i)
    println()
    for (i in 2..9 step 3) print(i)
    println()
    for (i in 'd'..'g') print (i)
    println()

//    Try out some loops. Like other languages, Kotlin has while loops, do...while loops, and ++ and -- operators. Kotlin also has repeat loops.
    println("\n\n")
    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")

    repeat(2) {
        println("A fish is swimming")
    }

}