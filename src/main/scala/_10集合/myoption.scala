package _10集合

/*
Scala Option(选项)类型用来表示一个值是可选的（有值或无值)。
为了让所有东西都是对象的目标更加一致，也为了遵循函数式编程的习惯，Scala鼓励你在变量和函数返回值可能不会引用任何值的时候使用Option类型。
在没有值的时候，使用None，这是Option的一个子类。如果有值可以引用，就使用Some来包含这个值。Some也是Option的子类。
None被声明为一个对象，而不是一
 */
object myoption {

  def main(args: Array[String]): Unit = {
    println("option选项集合--")

    // 虽然 Scala 可以不定义变量的类型，不过为了清楚些，我还是
    var myMap:Map[String,String] = Map("key1" -> "你好")
    myMap += ("key2" -> "世界")
    myMap += ("key3" -> "meili")
    val value1: Option[String] = myMap.get("key1")
    val value2: Option[String] = myMap.get("key2")
    val value3 = myMap.get("key3")
    //  Option[String] 通过此类型的应用告诉我们 程序会尽量给我们传回一个String对象，如果没有则返回None
    //  Option对象也只是一个类,Some和None是他的一个子类,入过能找到返回值就会用Some包装返回,否则直接返回一个None对象

    println(value1.)     // Some(value)    // 直接返回的是一个Some对象
    println(value1.get) // 当返回的是Some对象的是后说明返回成功了,就可以通过get方法得到里面的内容
    println(value2)  //master
    println(value3.getOrElse(None)) // None   // 如果不确定返回的是Some还是None就直接执行getOrElse
    //dev
  }
}
