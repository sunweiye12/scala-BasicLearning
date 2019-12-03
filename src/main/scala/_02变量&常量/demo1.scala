package _02变量

/*
一、变量： 在程序运行过程中其值可能发生改变的量叫做变量。如：时间，年龄。
二、常量 在程序运行过程中其值不会发生变化的量叫做常量。如：数值 3，字符'A'。
 */
object demo1 {
  def main(args: Array[String]): Unit = {

    // 在 Scala 中，使用关键词 "var" 声明变量，使用关键词 "val" 声明常量。
    println("变量")  // --> 定义变量并修改变量
    var myVar : String = "变量"
    myVar= "修改后的变量"
    println(myVar)

    println("常量")  // --> 定义常量修改报错
    val myVal : String = "常量"
//    myVal = "修改不了"
    println(myVal)

    //声明变量和常量不一定要指明数据类型，其数据类型是通过变量或常量的初始值推断出来的。
    //所以，没有指明数据类型的时候要给出初始值，否则报错
    println("声明方式")
    var myString = "你好世界"
    val myInt = 12
    println(myString)
    println(myInt)
    // 多变量的声明
    val xmax, ymax = 100  // xmax, ymax都声明为100
    println(xmax)
    println(ymax)
    // 元祖类型
    var pa : (Int, String) = (40,"哈哈")
    println(pa)
  }
}
