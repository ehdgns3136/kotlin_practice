fun unitFunction(): Unit {
    println("Hello")
    return
}

fun testPlatformType() {

}

fun safeCallWithLet(a: String?) {
    a?.let(::println)
}

fun safeCallWithLetAndElvis(a: String?) {
    a?.let {
        println(it)
    } ?: println("Hello1!!")
}

open class A(){

}

class B : A{
    constructor () : super() {

    }
}

fun testAsWithQuestionMark(o: Any) {
//    val a: A? = o as? A ?:

}