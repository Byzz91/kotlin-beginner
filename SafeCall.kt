/**
 * 코틀린에서는 기본적으로 null을 허용하지 않는다.
 */
fun safeCallExample() {
    val tmp: String? = null
    println(tmp?.length)
}

// SafeCall
fun getSize(a: String?) = a?.length


// SafeCall의 장점, null 인지 if 체크가 필요한 부분에서 간단한 코딩이 가능해진다.
data class AAA(val bbb: BBB?)
data class BBB(val ccc: CCC?)
data class CCC(val name: String?)

@Test
fun test() {
    val aaa: AAA = AAA(BBB(null))
    val name = aaa?.bbb?.ccc
}