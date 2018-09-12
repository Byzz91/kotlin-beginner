fun ElvisOperator() {
    val temp: String? = "Hello, World"
    val size = temp?.length ?: 0
}

val size = temp?.length ?: throw NullPointerException("temp is null")