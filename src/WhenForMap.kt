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
 * for example
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

for (value in 1..10 step 2) {
    println(value)
}

/**
 * For - Map Example
 */
val map = mutableMapOf(
    1 to "ABC", 
    2 to "BBB", 
    3 to "CCC"
)

for ((key, value) in map) {
    println("key $key value $value")
}