/**
 * HigherOrderFunction
 */
// 함수를 파라메터로 전달하거나 리턴가능!
// lambda를 통해 축약 형태로 사용 가능
// 변수로 함수를 가질 수 있다.
class ExampleUnitTest {
    /**
     * HigherOrderFunction 파라메터가 없는 경우
     */
    fun prt(body: () -> String) {
        println(body())
    }

    /**
     * 파라메터가 있는 경우 1개
     */
    fun prt2(body: (Int) -> String) {
        println(body(1))
    }

    /**
     * 파라메터가 있는 경우 2개
     */
    fun prt3(body: (Int, String) -> String) {
        println(body(1, "Hello, World"))
    }

    fun prt4(body: (Int, String) -> String, body2: (String) -> String) {
        print("${body(1, "Good")}, ${body2("Morning")}")
    }

    fun body2(): String = "Hello, HigherOrderFunction"

    fun shortMessage(int: Int, message: String): String = "$int $message"

    @Test
    fun higherOrderFunc() {
        // 이게 구현체라고 생각하면 쉬울 듯?
        prt({ "Hello, HigherOrderFunction" })
        println(body2())

        prt2({ "$it return message" })
        prt2 { "$it return message" } // 람다식으로 다음과 같이 축약 될 수 있다.

        prt3({ int, message -> "$int, $message was printed" })

        /**
         * 다음과 같이 축약 될 수 있다.
         */
        prt3({ int, message -> shortMessage(int, message) })
        prt3(::shortMessage)

        /**
         * 여러개의 파라미터가 메서드로 제공되어야 하는 경우
         */
        prt4({ int, message -> "$int $message" }) { "$it" }

        val variableFun: () -> Unit = {
            println("VariableFun")
        }
        variableFun()

        lateinit var variableFun2: () -> Unit
        variableFun2 = {
            println("Hello, World")
        }

        variableFun2()
    }

    fun sumAndEtc(func: (Int, Int) -> Int) {
        println(func(1, 2))
    }

    @Test
    fun higherOrderFunction() {
        sumAndEtc({ i1, i2 -> (i1 + i2) })
        sumAndEtc({ i1, i2 -> (i1 * i2) })
        sumAndEtc({ i1, i2 -> (i1 - i2) })
        sumAndEtc({ i1, i2 -> (i1 / i2) })
    }
}