//val action = {println(42)}
val action: () -> Unit = {println(42)}

//val sum = {x: Int, y: Int -> x + y}
val sum: (Int) -> Int = {x -> x}

fun a(): (Int) -> Int {
    return {x -> x}
}

val returnUnit: () -> Unit = {
    "hello"
}

val returnAny: () -> Any = {
    "hello"
}

fun getFunAsParameter(f: (x: Int) -> Int) {
    f(10)
}

fun returnUnitAsFunction() : Unit {
    println("Hello")
}