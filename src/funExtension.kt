/**
 * 함수 확장
 */
fun Int.getSum(a: Int, b: Int): Int? = this + a + b
// 1.getSum(10, 10)
// this는 1을 나타낸다.

infix fun Int.getSumB(b: Int): Int? = this + b
println("sum ${1 getSumB 2}")