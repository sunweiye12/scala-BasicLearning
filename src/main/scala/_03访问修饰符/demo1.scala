package _03访问修饰符

/*
基本和Java的一样，分别有：private，protected，public。默认情况下，Scala对象的访问等级都是public。
1，Scala中的private限定符，比Java更严格，在嵌套类情况下，外层类甚至不能访问被嵌套类的私有成员
2，protected 因为它只允许保护成员在定义了该成员的类的子类中被访问。而在java中，用protected关键字修饰的成员，除了定义了该成员的类的子类可以访问，同一个包里的其他类也可以进行访问。
3，Scala中，如果没有指定任何的修饰符，则默认为public。这样的成员在任何地方都可以被访问
 */
object demo1 {
  def main(args: Array[String]): Unit = {

    // 元祖类型
    var pa : (Int, String) = (40,"哈哈")
    println(pa)
  }
}
