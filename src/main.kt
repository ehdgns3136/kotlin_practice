import com.sun.org.apache.xpath.internal.operations.Bool

fun main(args: Array<String>) {
//    val list = arrayListOf(1, 2, 3)
//    println(list.joinToString())
    print(anonymousFun(10))
    print(lambdaFun(10))

    println(listOf(10,20).filter(::isOdd))


}
