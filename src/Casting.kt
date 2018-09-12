fun test() {
    val a: Any? = "ABC"
    val b: Int? = a as? Int // as? = java.lang.ClassCastException 예방
    val c: Int? = a as? Int ?: 0

    println(b)
    println(c)
}

fun test2() {
    val a: Any? = "ABC"
    when (a) {
        is Int -> println("is Integer $a")
        is String -> println("is String $a")
        else -> println("Nothing")
    }
}