class Sample {
    inner class SampleB {
        fun Int.foo() {
            val a = this@Sample
            val a1 = this@SampleB

            test()
            this@Sample.test()
        }

        fun test() {
            println("test - inner class SampleB")
        }
    }

    fun test() {
        println("test - outter class Sample")
    }
}