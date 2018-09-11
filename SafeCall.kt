/**
 * 코틀린에서는 기본적으로 null을 허용하지 않는다.
 */
fun safeCallExample() {
    val tmp: String? = null
    println(tmp?.length)
}

// SafeCall
fun getSize(a: String?) = a?.length