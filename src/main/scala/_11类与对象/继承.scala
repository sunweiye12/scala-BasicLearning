package _11类与对象
/**
Scala继承一个基类跟Java很相似, 但我们需要注意以下几点：
1、只有主构造函数才可以往基类的构造函数里写参数。
2、重写一个**非抽象方法必须使用override修饰符。
3、在子类中重写超类的**抽象方法时，你不需要使用override关键字
 */

class Location( val xc: Int, val yc: Int, val zc :Int) extends Point(xc, yc){

  var z: Int = zc     //声明自己新增加的节点，其余两个节点已经在父类中声明

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println ("x 的坐标点 : " + x);
    println ("y 的坐标点 : " + y);
    println ("z 的坐标点 : " + z);
  }
}

// Scala重写一个非抽象方法，必须用override修饰符。
abstract class Person {     // abstract只能用于修饰类不能修饰方法（当修饰类时主要就是为了继承使用）
  var name = ""
  override def toString = getClass.getName + "[name=" + name + "]"    // 重写非抽象方法都需要 注明：override
  def myMe()         // 创建一个抽象方法
}

class Employee extends Person {

  var salary = 0.0
  override def toString = super.toString + "[salary=" + salary + "]"

  def myMe(): Unit = {
      println("重写父类中的抽象方法")
  }
}

// test
object 继承{
  def main(args: Array[String]) {
    // 创建一个对象
    val loc: Location = new Location(10, 20, 15)
    // 移到一个新的位置
    loc.move(10, 10, 5)

    // 重写一个非抽象方法的时候必须重写override
    val fred = new Employee   // 创建一个员工类
    fred.name = "Fred"
    fred.salary = 50000
    fred.myMe()
    println(fred)
  }
}
