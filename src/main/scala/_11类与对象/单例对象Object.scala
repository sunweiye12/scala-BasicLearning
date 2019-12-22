package _11类与对象

/**
在 Scala 中，是没有 static 这个东西的，但是它也为我们提供了单例模式的实现方法，那就是使用关键字 object。
 两个名字相同且要在一个源文件里面
 */

// 创建一个类 并私有构造方法
class Marker private(val color:String) {

  println("创建" + this)    // 当创建的时候就会就会执行

  override def toString(): String = "颜色标记："+ color

}

// 伴生对象，与类名字相同，可以访问原生类的私有属性和方法
object Marker{

  // 创建以恶搞map结构
  private val markers: Map[String, Marker] = Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "green" -> new Marker("green")
  )

  // Object（参数1 ，参数2 ，……）这样是隐含的调用apply方法
  def apply(color:String) = {
    if(markers.contains(color)) markers(color) else null
  }

  // 定义方法返回map中存在的Marker对象
  def getMarker(color:String) = {
    if(markers.contains(color)) markers(color) else null
  }

  // test
  def main(args: Array[String]) {
    //半生对象只有在第一此调用的时候会执行init代码
    Marker("red")
    println(Marker apply ("red"))  //相当于直接调用 Marker.apply("red ")方法  ====   Marker apply ("red")
    // 单例函数调用，省略了.(点)符号
    println(Marker getMarker "blue")
  }
}