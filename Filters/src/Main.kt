
fun main(){
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    println(decorations.filter { it[0] == 'p'})

    val eager = decorations.filter { it[0] == 'p'}

    println("eager : $eager")

    val filtered = decorations.asSequence().filter { it[0] == 'p'}

    println("filtered : $filtered fil0 : ${filtered.elementAt(0)}")

    val forcedEager = filtered.toList()

    println("forcedEager : $forcedEager \n\n")

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }

    println("\n\nlazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.elementAt(2)}")
    println("-----")
    println("all: ${lazyMap.toList()}")

    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
        println("access: $it")
        it
    }
    println("\n\n-----")
    println("filtered: ${lazyMap2.toList()}")


}