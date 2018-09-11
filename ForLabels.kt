fun forLabelTest() {
    outter@ for (i in 1..100) {
        inner@ for (j in 1..100) {
            if (j > 10) break@outter
            print(j)
        }
        println("")
    }
}

fun foo() {
    val ints = mutableListOf(1, 2, 0, 4, 5)
    ints.forEach lit@ {
        if (it == 0) return@lit
        print(it)
    }
}