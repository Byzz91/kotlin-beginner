class Sample {
    val name: String = "Name"

    /**
     * Static을 생성한다고 생각하면 된다.
     */
    companion object {
        val type: Int = 0

        fun isTypeZero(): Boolean {
            return type == 0
        }
    }
}