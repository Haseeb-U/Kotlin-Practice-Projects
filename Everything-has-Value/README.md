# Task: Learn why (almost) everything has a value
In this task, you learn why almost everything in Kotlin has a value, and why that's useful.
<br><br>
Some other languages have statements, which are lines of code that don't have a value. In Kotlin, almost everything is an expression and has a value—even if that value is kotlin.Unit.
<br><br>
In Main.kt, write code in main() to assign a println() to a variable called isUnit and print it. (println() does not return a value, so it returns kotlin.Unit.)
<br><br>
// Will assign kotlin.Unit
<br>
val isUnit = println("This is an expression")
<br>
println(isUnit)
<br><br>
Run your program. The first println() prints the string "This is an expression". The second println() prints the value of the first println() statement, that is, kotlin.Unit.
<br><br>
Declare a val called temperature and initialize it to 10.
<br><br>
Declare another val called isHot and assign the return value of an if/else statement to isHot, as shown in the following code. Because it is an expression, you can use the value of the if expression right away.
<br><br>
val temperature = 10<br>
val isHot = if (temperature > 50) true else false<br>
println(isHot)
<br><br>
Use the value of an expression in a string template. Add some code to check the temperature to determine whether a fish is safe or too warm, then run your program.
<br><br>
val temperature = 10<br>
val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."<br>
println(message)
<br><br>
Note: Loops are exceptions to "everything has a value." There's no sensible value for for loops or while loops, so they do not have values. If you try to assign a loop's value to something, the compiler gives an error.
