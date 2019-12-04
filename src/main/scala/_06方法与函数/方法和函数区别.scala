package _06方法与函数

import java.util.Date

/*
1。函数可作为一个参数传入到方法中，而方法不行。
2。在Scala中无法直接操作方法，如果要操作方法，必须先将其转换成函数。有两种方法可以将方法转换成函数：
3。函数必须要有参数列表，而方法可以没有参数列表
4。在函数出现的地方我们可以提供一个方法
 */
object 方法和函数区别 {


  def main(args: Array[String]): Unit = {
    println("区别1————————")
    //调用m1方法，并传入f1函数
    val r1 = m1(f1)
    println(r1)
    //调用m1方法，并传入f2函数
    val r2 = m1(f2)
    println(r2)

    println("区别2————————")
    //通过m0 _将方法转化成函数
    ttt(m0 _);
    //如果直接传递的是方法名称，scala相当于是把方法转成了函数
    ttt(m0)
    //通过x => m0(x)的方式将方法转化成函数,这个函数是一个匿名函数，等价：(x:Int) => m0(x)
    ttt(x => m0(x))

    println("区别3----")  //函数必须要有参数列表，而方法可以没有参数列表
    def me1 = {println("fang1")}
    me1
    def me2() = {println("fang2")}
    me2()

    var fa1 = () => {println("han1")}
    fa1()
    // var fa2 = = {println("han1")}  // 必须要有（）或者参数，否则报错

    println("区别4----")
    // 需要函数的地方，如果传递一个方法，会自动进行ETA展开（把方法转换为函数）

  }

  //定义一个方法---------------------------------------
  //方法 m1 参数要求是一个函数，函数的参数必须是两个Int类型
  //返回值类型也是Int类型
  def m1(f:(Int,Int) => Int) : Int = {
    f(2,6)
  }

  //定义一个函数f1,参数是两个Int类型，返回值是一个Int类型
  val f1 = (x:Int,y:Int) => x + y
  //再定义一个函数f2
  val f2 = (m:Int,n:Int) => m * n

  // ----------------------------------------------
  // 定义一个方法，参数是函数（int）=> int 返回值为空
  def ttt(f:Int => Int):Unit = {
    val r = f(10)
    println(r)
  }
  // 定义了一个方法
  def m0(x:Int) : Int = {
    x * 10    // 只有一个语句自动返回
  }

}
