fun <T> asList(vararg item: T): List<T> {
    val result = ArrayList<T>()
    for (i in item) {
        result.add(i)
    }

    return result
}