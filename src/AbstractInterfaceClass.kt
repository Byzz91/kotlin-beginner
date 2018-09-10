/**
 * Secondary Constructor Example
 */
class Person(val name: String, val age: Int) {
    constructor(name: String) : this(name, 0)

    init {
        println("name $name age $age")
    }
}

/**
 * Constructor Example
 */
class UpperCaseExample(val name: String) {
    val nameUpperCase: String = name.toUpperCase()

    init {
        println("name $name nameUpperCase $nameUpperCase")
    }
}

/**
 * Private Constructor Example
 */
class PrivateConstructor private constructor(val name: String) {
}

/* ============================================= */
/**
 * Abstract Class and interfaces
 */
abstract class AbstractBase(val age: Int)

interface InterfaceBase {
    fun moreThan10YearsOld(): Boolean
}

open class Customer(age: Int) : AbstractBase(age), InterfaceBase {
    override fun moreThan10YearsOld() = age > 10
}
/* ============================================= */

/**
 * Main
 */
fun main(args: Array<String>) {
    /**
     * Lazy Init
     *
     * 초기화가 되는 시점을 잘 파악해본다.
     * 처음으로 호출되는 시점에서 초기화가 진행된다.
     */
    val name: String by lazy {
        println("Lazy Init")
        "임원빈"
    }

    lateinit var name2: String
    name2 = "임원빈2"
}