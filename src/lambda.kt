fun <T, R, Q> lambdaTest(
    initial: T,
    initial2: R,
    combine: (first: T, second: R) -> Q
) {
    println(combine(initial, initial2))
}

fun <T, R> Collection<T>.fold(
    initial: R,
    combine: (acc:R, nextElement: T) -> R
): R {
    var accumulator: R = initial

    for(element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}

val lambdaFun = {a: Int ->
    a
}

val anonymousFun = fun (a: Int): Int {
    return a
}

data class Person(
    val name: String,
    val age: Int
)

fun findMaxAgePerson() {

    val people = listOf(Person("Alice", 20), Person("Bob", 30))
    people.maxBy { it.age }
}