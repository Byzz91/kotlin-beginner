class Outter {
    val name: String = "WONBEEN"
    inner class Inner {
        fun foo() {
            println(name)
        }
    }
}

// Inner 클래스에 접근할 때는 인스턴트를 생성해주어야 한다.
Outter().Inner().foo()