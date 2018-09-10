@Test
fun whenExample() {
    val validNumbers = 9..10
    val a: Int = 30
    when (a) {
        in 1..10 -> println("1~10")
        in validNumbers -> println("Validnumbers")
        !in 10..20 -> println("a is outsite the range")
        else -> println("else")
    }
}

fun isString(a: Any) = when (a) {
    a is String -> true
    else -> false
}

/*
 * Print, MutableList
 */
val list = mutableList(1, 2, 3, 4, 5, 6)

for (x in list) {
    println("$x")
}

for (x in list.indices) {
    println("$x")
}

for ((index, value) in list.withIndex()) {
    println("$index $value")
}