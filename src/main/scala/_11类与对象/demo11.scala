package _11类与对象

/*
类是对象的抽象，而对象是类的具体实例。
类是抽象的，不占用内存，而对象是具体的，占用存储空间。
 */

/**
 * Scala中的类不声明为public，一个Scala源文件中可以有多个类。
 * 以下实例的类定义了两个变量 x 和 y ，一个方法：move，方法没有返回值。
 * Scala 的类定义可以有参数，称为类参数，如上面的 xc, yc，类参数在整个类中都可以访问。
 * @param xc
 * @param yc
 */
class Point (xc: Int, yc: Int) {       // 相当于在类的声明上实现了构造方法 lass Point private(xc: Int, yc: Int) { } 实现构造方法的似有化
  // 因此在scala中支持声明对象的多个构造方法
  // 必须对类中传递的参数尽享声明在下面才能够继续使用
  // 在创建一个对象的时候他会默认执行这个类定义下的所有非方法语句
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println ("x 的坐标点: " + x);
    println ("y 的坐标点: " + y);
  }

  println("创建Point")
}


// 下面进行测试
object demo11 {
  def main(args: Array[String]) {

    val pt = new Point(10, 20);   // 创建一个对象

    pt.move(10, 10);    // 调用对象的一个方法
  }
}
