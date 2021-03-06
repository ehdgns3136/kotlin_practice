// lambda should be always in curly braces!!


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

val lambdaFun = {a: Int -> a }

val lambdaFun2: (Int) -> Int = ::myNewFun

fun myNewFun(a: Int): Int {
    return a
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
//    people.maxBy { it.age }
//    people.maxBy(Person::age)
    val oldestOne: Person? = people.maxBy({person: Person -> person.age })
    people.maxBy { person: Person -> person.age }

    println(oldestOne?: "hello")

    lambdaTest1{a: Int ->
        println("hello")
        println("hello")
        println("hello")
        println("hello")
        println("hello")
        println("hello")
        println("hello")
        a+1
    }
}

fun lambdaTest1(myFun: (Int) -> Int) {
    myFun(10)
}

fun testRun(a: Int) {
    run {
        println("Hello0")
        return@run
    }

    println("Hello1")
}