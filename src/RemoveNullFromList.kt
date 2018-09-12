val list: List<String?> = mutableListOf("A", null, "C")
list.filter { it != null }.forEach { println(it) }

val cloneListWithoutNull: List<String> = list.filterNotNull()
cloneListWithoutNull.forEach {
    println(it)
}

data class User(val name: String, val age: Int, val id: String)

fun nullException() {
    val user: User? = User("eyedroot", 28, "eyedroot")

    user?.let {
        data.name = it.name
        data.age = it.age
        data.id = it.id
    } ?: let {
        println("Sample is null")
        data.visibility = View.GONE
        data.visibility = View.GONE
        data.visibility = View.GONE
    }
}