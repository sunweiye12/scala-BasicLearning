package _06方法与函数

import java.awt.print.Printable
import java.util.Date

/*
Scala 中的方法跟 Java 的类似，方法是组成类的一部分。
Scala 中的函数则是一个完整的对象，Scala 中的函数其实就是继承了 Trait 的类的对象。
Scala 中使用 val 语句可以定义函数，def 语句定义方法
 */
object demo6 {


  def main(args: Array[String]): Unit = {
    println("普通方法--")
    var sum = addInt(5,20)
    println(sum)
    myPrintMe("你好 世界")

    println("可变参数方法--")
    myPrintStrings(1,"你","好","呀")

    println("默认参数方法--")
    println(addInt1())
    println(addInt1(3,4))

    println("内嵌函数————")
    println(factorial(4))

    println("指定函数参数名---")
    printInt(b = 2,a = 5)   // 不一定非要按照方法定义的参数顺序来进行传递

    println("匿名函数-----")
    // 匿名函数的使用要传递给一个变量，通过此变量来进行调用
    // 箭头左边是参数列表，右边是函数体
    var inc = (x:Int) => x+1
    println(inc(7))

    var mul = (x: Int, y: Int) => x*y
    println(mul(7,5))

    println("函数柯里化————") // 就是将接收两个参数的函数变成新的接受一个参数的函数的过程
    println(add1(2,3))
    println(add2(2)(3))

    println("偏应用函数优化----")   // 一种代码的优化方案
    val date = new Date
    log(date, "message1" )
    Thread.sleep(1000)
    log(date, "message2" )
    Thread.sleep(1000)
    log(date, "message3" )
    // 由于调用上面的函数data参数一直没有变，但是由于方法参数的限制导致相同的data传递了三次
    // 使用偏应用函数优化以上方法，绑定第一个 date 参数，第二个参数使用下划线(_)替换缺失的参数列表，并把这个新的函数值的索引的赋给变量
    val logWithDateBound = log(date, _ : String)    // 绑定了此方法，并且第一参数绑定，第二个参数用户定义
    logWithDateBound("message1" )
    Thread.sleep(1000)
    logWithDateBound("message2" )
    Thread.sleep(1000)
    logWithDateBound("message3" )


  }

  // 定义一个方法
  def addInt( a:Int, b:Int ) : Int = {
    var sum:Int = 0
    sum = a + b
    return sum
  }

  // 如果方法没有返回值，可以返回为 Unit，这个类似于 Java 的 void
  def myPrintMe(str : String) : Unit = {
    println(str)
  }

  // 通过在参数的类型之后放一个星号来设置可变参数(可重复的参数)
  def myPrintStrings( ars : Int , args:String* ) = {
    var i : Int = 0;
    print(i + "=" + ars + " ," )
    i = i + 1;
    for( arg <- args ){
      print(i + "=" + arg + " ," );
      i = i + 1;
    }
  }

  // 在函数中设置默认参数
  def addInt1( a:Int=5, b:Int=7 ) : Int = {
    var sum:Int = 0
    sum = a + b
    return sum
  }

  // 内嵌函数
  def factorial(i: Int): Int = {
    // 定义内嵌函数
    def fact(i: Int, accumulator: Int): Int = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }
    // 调用内嵌的函数（不能在外部访问）
    fact(i, 1)
  }

  //一般情况下函数调用参数，就按照函数定义时的参数顺序一个个传递。但是我们也可以通过指定函数参数名，并且不需要按照顺序向函数传递参数
  def printInt( a:Int, b:Int ) = {
    println("Value of a : " + a );
    println("Value of b : " + b );
  }

  // 函数柯里化
  def add1(x:Int,y:Int)=x+y
  def add2(x:Int)(y:Int) = x + y


  //偏应用函数
  def log(date: Date, message: String)  = {
    println(date + "----" + message)
  }


}
