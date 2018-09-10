val list = mutableListOf(1, 2, 3, 4, 5)
list.filter { item -> item > 5 }.map { item -> Log.d("TAG", "index ${item * 2}") }

val list = mutableListOf(1, 2, 3, 4, 5)
list.filter { it > 5 }.map { println(it) }

val map = mutableMapOf(1 to "value", 2 to "value", 3 to "value")
map.forEach { item -> 
    println("key ${item.key} value ${item.value}")
}

map.forEach {
    println("key ${it.key} value ${it.value}")
}

// 사용하지 않을 때 "_" 언더바로 나타낼 수 있다.
map.forEach { _, value -> 
    println("$value")
}