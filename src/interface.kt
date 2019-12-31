interface IBlock<in T> {
    fun fill(block: T)
}

interface ICube<out T> {
    fun show(): T
}

fun fillBlock(b: IBlock<Number>) {
    b.fill(10.0)
}

fun showCube(c: ICube<String>): Any {
    return c.show()
}