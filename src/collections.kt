fun collections1() {
    val numbers: Collection<Int> = setOf(1, 2, 3)
    numbers.max()
}

fun <T> collections2(vararg values: T, myFun: (values: Array<out T>) -> T) {
//    for (item in values) {
//        println(item)
//    }
//
//    for (item in values.withIndex()) {
//        println(item)
//    }
    println(values::class)

//    values.map {
//        println(it)
//    }

//    if (values is Array) {
//        values.map {
//            println(it)
//        }
//    }
    for (item in values) {
        println(item)
    }

    myFun(values)
}

