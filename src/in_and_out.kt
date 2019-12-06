//https://thdev.tech/kotlin/androiddev/2017/10/03/Kotlin-Generics/

interface Output<T> {
    fun isArgument(argument: T): Boolean
}

class ExampleUnitTest { 
    val items = ArrayList<Output<String>>()

    init {
        items.add(object: Output<String> {
            override fun isArgument(argument: String) = false
        })

        items.add(object: Output<String> {
            override fun isArgument(argument: String) = true
        })
    }
}