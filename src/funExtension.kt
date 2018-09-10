/**
 * 함수 확장
 */
fun Int.getSum(a: Int, b: Int): Int? = this + a + b
// 1.getSum(10, 10)
// this는 1을 나타낸다.

infix fun Int.getSumB(b: Int): Int? = this + b
println("sum ${1 getSumB 2}")

/**
 * 클래스 타입에 따른 메서드 호출
 */
open class C
class D: C()
fun D.printFoo(): String = "D"
fun C.printFoo(): String = "C"
fun printF(d: C) {
    println(d.printFoo())
}

@Test
fun tested() {
    printF(D())
}
/* ============================ */

/**
 * 클래스안 같은 이름의 확장된 메서드의 호출
 */
class F {
    fun foo() {
        println("Hello, World")
    }
}

fun F.foo(a: Int) {
    println("Hello, World2")
}

@Test
fun classEX() {
    val f = F()
    f.foo() // print Hello, World
    f.foo(1) // print Hello, World2
}

/**
 * Default Params
 */
fun setParams(name: String, email: String = "email@email.com", age: Int)
setParams("WONBEEN LIM", age = 28)