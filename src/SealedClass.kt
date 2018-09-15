sealed class Expr(val name: String)
class Const(val number: Double) : Expr("")
data class Sum(val e1: Expr, val e2: Expr) : Expr("")
object NotANumber : Expr("")

// sealed 클래스는 같은 파일에 존재해야 하며, 기본적으로 private을 갖는다.