open class A {
    open fun f() {
        println("A")
    }
}

interface B {
    fun f() {
        println("B")
    }
}

class C() : A(), B {
    override fun f() {
        super<A>.f()
        super<B>.f()
    }
}