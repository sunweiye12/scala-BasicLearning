package _10集合

/*
Scala Option(选项)类型用来表示一个值是可选的（有值或无值)。
 */
object myoption {

  def main(args: Array[String]): Unit = {
    println("option选项集合--")

    // 虽然 Scala 可以不定义变量的类型，不过为了清楚些，我还是
    // 把他显示的定义上了

    val myMap: Map[String, String] = Map("key1" -> "value")
    val value1: Option[String] = myMap.get("key1")
    val value2: Option[String] = myMap.get("key2")
    //  Option[String] 通过此类型的应用告诉我们 程序会尽量给我们传回一个String对象，如果没有则返回None
    println(value1) // Some("value1")
    println(value2) // None

  }
}
