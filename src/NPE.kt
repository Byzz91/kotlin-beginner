val temp: String? = null
// val size = temp!!.length

val size = try {
    temp!!.length
} catch (e: NullPointerException) {
    0
}