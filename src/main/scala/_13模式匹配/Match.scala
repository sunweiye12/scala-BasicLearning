package _13模式匹配

/**
match 对应 Java 里的 switch，但是写在选择器表达式之后。即： 选择器 match {备选项}。
  箭头符号 => 隔开了模式和表达式。
 */

// test
object Match{

  def main(args: Array[String]) {
    println("match匹配----")
    println(matchTest(4))
    println(matchTest(3))

    println(matchTest("two"))
    println(matchTest("test"))
    println(matchTest(1))
    println(matchTest(6))
    matchTest()

    // 样例类的使用
    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 32)
    val charlie = new Person("Charlie", 32)

    for (per <- List(alice, bob, charlie)) {
      per match {
        case Person("Alice", 25) => println("Hi Alice!")      // 只有是样例类，才可以在case后面match
        case Person("Bob", 32) => println("Hi Bob!")
        case Person(name, age) =>
          println("Age: " + age + " year, name: " + name + "?")
      }
    }
  }

  // 匹配一个int值来返回一个String字符串
  def matchTest(x: Int): String =
    x match {
    case 1 => "one"
    case 2 => "two"
    case 4 => "heh"
    case _ => "many"
  }

  // 重载此方法
  def matchTest(x: Any): Any =
    x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"    // 如果传入的类型为 Int 执行
    case _ => "many"            // 以上都没有匹配到执行
  }

  // 重载此方法
  def matchTest()={
    print("hello world")
  }


  // 样例类
  case class Person(name: String, age: Int)
}
