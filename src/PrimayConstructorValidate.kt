/**
 * init block을 활용한 validate 체크
 */
class UserInfo(name: String = "Name", age: Int = 0, birthday: String = "2001-00-00") {
    // 전역 변수를 정의
    val name: String
    val age: Int
    val birthday: String

    init {
        this.name = name.takeIf { it.isNotEmpty() } ?: ""
        this.age = age.takeIf { it > 0 } ?: 0
        this.birthday = birthday.takeIf { it.isNotEmpty() } ?: ""
    }
}