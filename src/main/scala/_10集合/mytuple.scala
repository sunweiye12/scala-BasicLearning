package _10集合

/*
Scala 元组：与列表一样，元组也是不可变的，但与列表不同的是元组可以包含不同类型的元素
 */
object mytuple {

  def main(args: Array[String]): Unit = {
    println("tuple元组集合--")

    // 元组的声明
    val t = (1, 2, 3.14, "Fred", 'a')       // 推荐使用
    val t1 = new Tuple4(1, 3.14 , "hello",4)  // 通过这种方式创建元组(前面的4代表元素的个数)，参数只能有三个   --》Scala 支持的元组最大长度为 22
    println(t._4)  // 通过._i 的方式来获取对应下标的元素

    println(t)
    println(t1)
  }
}
