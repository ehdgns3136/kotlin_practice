fun collections1() {
    val numbers: Collection<Int> = setOf(1, 2, 3)
    numbers.max()
}

fun <T> collections2(vararg values: T) {
    for (item in values) {
        println(item)
    }

    for (item in values.withIndex()) {
        println(item)
    }
}

