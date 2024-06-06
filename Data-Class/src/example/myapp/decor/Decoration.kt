package example.myapp.decor

data class Decoration(val rocks : String) {
//    val abc : String = "ABC"
}

fun makeDecorations(){
    val deco1 = Decoration("grantie")
    println(deco1)
    val deco2 = Decoration("slate")
    println(deco2)
    val deco3= Decoration("slate")
    println(deco3)

    println(deco1.equals(deco2))
    println(deco3.equals(deco2))
    println(deco1==deco2)
    println(deco3==deco2)
    println(deco1===deco2)
    println(deco3===deco2)
}

data class Decoration2(val rocks : String, val wood :String, val diver:String) {
    val abc : String = "ABC"
}

fun makeDecoration2(){
    val d5 =Decoration2("crystal", "wood", "diver")

    val (rock, wood, diver) = d5
    val (rock1, _, diver1) = d5
    println(rock)
    println(wood)
    println(diver)

}

fun main(){
    makeDecoration2()
}