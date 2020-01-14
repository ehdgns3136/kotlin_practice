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

fun changeElement() {
    val myList = mutableListOf<String>()
    myList.add("100")

    println(myList)
}

package global.tada.inboxservice.domain.banner

import java.util.UUID

data class Banner(
    val id: UUID = UUID.randomUUID(),
    val type: BannerType,
    val xxx: String,
    val thumbnail: View,
    val detail: View,
    val priority: Int
)


data class View (
    val type: String // 'Image", "url", "html"...,
//    val content: String,
    // ...
)

fun handleCouponIssued(payload: Any) {
    val type = BannerType.COUPON_ISSUED
    val xxx = "from payload"
    val uuid = "from payload"

//    val targetItem: TargetItem = TargetItemRepository ....
    // val banner = BannerRepository...
    // 둘 연관 시키기
    // 끝
}


// HttpController
// @GetMapping("/v1/banner")
// fun index(auth: OAuth2...) {
// user uuid로 targetItem 찾기
// 걔 한테 박혀있거나, 혹은 안박혀있다면 uuid로 검색해서 banner 찾기.
// banner 가 여러개 나온다면
/**
 * [Banner.priority] 로 구분 (높은 숫자가 높은 priority)
 * */

enum class BannerType(@JsonValue val value: Int) {
    COUPON_ISSUED(10)
}