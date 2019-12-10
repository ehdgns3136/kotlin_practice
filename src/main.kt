import com.sun.org.apache.xpath.internal.operations.Bool

fun main(args: Array<String>) {
    val a = TestForConstructor("A", "C")
    val b = TestForConstructor("P", "Q", 2)
    println(a.s)
    println(b.s)
}

