class UserInfo(val name: String, val age: Int, val birthday: String) {
    constructor(name: String, age: Int) : this(name, age, "")
    constructor(name: String) : this(name, 0, "")
}

/**
 * 위 생성자는 아래로 대처가 가능하다.
 */
class UserInfo(
    val name: String = "WONBEEN LIM",
    val age: Int = 20,
    val birthday: String = "1991-01-01"
)

/**
 * @JvmOverloads를 사용하면, 자바에서도 생성자를 여러개 생성해준다.
 */
class UserInfo @JvmOverloads constructor(
    val name: String = "name",
    val age: Int = 0,
    val birthday: String = ""
)