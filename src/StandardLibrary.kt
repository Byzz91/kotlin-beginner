@Test
fun kotlinStandardLibrary() {
    /**
     * 코틀린 Standard 라이브러리
     */
    /* ========================= */
    val name: String? = "WONBEEN"
    name?.let {
        // null이 아닌경우에만 프린트
        println("$it named, ${it.length} !!!")
    } ?: let {
        println("null")
    }
}

fun applyTest() {
    /**
     * Apply
     */
    val textView = TextView(this).apply {
        text = "button"
        setTextColor(getColor(R.color.abc_background_cache_hint_selector_material_dark))
        setOnClickListener {  }
    }

    /**
     * run : 이미 생성된 객체에 대해서 연속 접근
     */
    textView.run {

    }

    /**
     * with : View에 접근할 때 주로 사용
     */
    fun onBindView() {
        with (itemView) {
            // ... itemView에 접근하기
        }
    }

    /**
     * also
     */
    data class Block(var name: String = "", var age: Int = 10)
    fun Block.copyName(age: Int) = Block().also {
        it.name = this.name
        it.age = age
    }

    /**
     * takeIf and takeUnless
     */
    @Test
    fun test() {
        val block: Block = Block("ABC")
        println("out ${block.takeIf { it.age > 10 }}")
        println("out ${block.takeUnless { it.age > 10 }}")
    }
}