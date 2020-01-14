interface IBlock<in T> {
    fun fill(block: T)
}

interface ICube<out T> {
    fun show(): T

    val value: T
}

fun fillBlock(b: IBlock<Number>) {
    b.fill(10.0)
}

fun showCube(c: ICube<String>): Any {
    return c.show()
}

abstract class MyAbstract {
    fun a() {
        println("Hello")
    }
}

open class OpenClass

class MyClass: OpenClass {
    constructor(): super()
}