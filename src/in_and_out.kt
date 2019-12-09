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

        val a = object: Output<String> {
            override fun isArgument(argument: String): Boolean {
                return false
            }
        }

        items.add(object: Output<String> {
            override fun isArgument(argument: String) = true
        })
    }

    private fun printAll(items: ArrayList<Output<String>>) {
        items.add(object: Output<String>{
            override fun isArgument(argument: String) = false
        })

        items.indices
            .forEach{it -> println(items[it])}
//            .filter{ it -> items[it].isArgument("") }
//            .forEach{println("item : " + items[it])}

//        items.add(null)

    }
}
