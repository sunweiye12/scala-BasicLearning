package _12Trait接口

/**
Scala Trait(特征) 相当于 Java 的接口，实际上它比接口还功能强大。
与接口不同的是，它还可以定义属性和方法的实现。  通过extend 来继承一个trait对象
 */

// 创建一个trait对象
trait Equal {         // 可以将trait理解成抽象类
  //  定义一个方法
  var name: String = "trait hello"
  // 定义一个没有实现的方法
  def isEqual()
  // 定义一个实现功能的方法
  def isNotEqual(): Unit = {
      println("trait中的原生方法")
  }
}

trait Equal1 {         // 可以将trait理解成抽象类
  // 定义实现的方法
  def isNotEqual1(): Unit = {
    println("trait中的原生方法1")
  }
}

class Point() extends Equal with Equal1 {   // 如果继承的两个类中包含相同的字段或者方法会爆报错
  def isEqual(): Unit = {   // 重写了此方法，不用加override修饰
      println("重写了此方法")
  }
}


// test
object MyTrait{
  def main(args: Array[String]) {
    println("接口特性----")
    val p1 = new Point()
    val p2 = new Point()
    val p3 = new Point()
    p1.isEqual()
    p2.isNotEqual()
    println(p1.name)
  }
}
