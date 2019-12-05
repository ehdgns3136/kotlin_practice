infix fun Any.hello(any: Any) {
    println("hello")
}

fun collections3() {
    val a: List<Any> = 1 makeList 2
    val b = 1 to 2

    println(a)
    println(b)
}

infix fun Any.to(other: Any) = Pair(this, other)
infix fun Any.makeList(other: Any) = listOf(this, other)