package _10集合
import scala.collection.mutable._
/*
Scala Map(映射)是一种可迭代的键值对（key/value）结构。所有的值都可以通过键来获取。
Map 中的键都是唯一的。
Map 也叫哈希表（Hash tables） 其中KV类型不可变
Map也有两种：可变与不可变，默认为不可变类型，当引入collect.mutable.Map时 使用的是可变类型的Map
 */
object mymap {

  def main(args: Array[String]): Unit = {
    println("map集合--")

    //声明以恶搞Map对象

    var M = Map()         // 如果不声明类型默认的类型是Nothing（不推荐使用）
    var A :Map[Char,Int] = Map()   // 空哈希表，键为字符串，值为整型
    val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")    // Map 键值对演示（省略类型）

    println(colors)
    println(A)     // 打印空的map结构

    A += ('a' -> 1)   // 不可变类型添加元素会报错
    A += ('b' -> 2)      // 添加元素
    A.addOne('b' -> 2)   // 添加元素
    println(A)          // 打印添加元素的map结构
    A += ('c' -> 3)     // 添加元素
    A -= ('c')          // 删除制定key的元素
    A.remove('c')

    println(A)     // 打印添加元素的map结构
    println(A.isEmpty)    // 判断是否为空
    println(A.contains('a')) // 判断是否包含某key
    println(A.contains('c'))  // 判断是否包含某key
    println(A.get('a'))      // 获取某key对应的value
    var kays = A.keys     // 返回keys的set集合
    println(s"keys : ${kays}")
    var values = A.values   // 返回values的iter集合
    println(s"values : ${values}")

    println("A = " + A)
    //  Map.++() 方法来连接两个 Map，Map 合并时会移除重复的 key
    var B = Map('a' -> 4,'f' -> 5)
    println("B = " + B)
    var C = A.++(B)       // 合并两个map集合，有重复的保留面的B
    println("A.++B : " + C)
  }
}
