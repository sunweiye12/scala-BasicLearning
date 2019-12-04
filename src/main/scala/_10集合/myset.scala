package _10集合
import scala.collection.mutable.Set
/*
Scala Set(集合)是没有重复的对象集合，所有的元素都是唯一的。
 */
object myset {

  def main(args: Array[String]): Unit = {
    println("set集合--")

    // 默认引用 scala.collection.immutable.Set，不可变集合
    val set = Set(1,2,3)
    println(set.getClass.getName) //
    println(set.exists(_ % 2 == 0)) //true
    println(set.drop(1)) //Set(2,3)

    // 可变集合需要引入 scala.collection.mutable.Set： 此类
    val mutableSet = Set(1,2,3)
    println(mutableSet.getClass.getName) // scala.collection.mutable.HashSet
    mutableSet.add(4)
    mutableSet.remove(1)
    mutableSet += 5
    mutableSet += 100   //增加一个元素（如果意境存在则不添加）
    mutableSet -= 2     //减少一个元素（如果不存在则不减少）

    println(mutableSet) // Set(5, 3, 4)

    val another = mutableSet.toSet
    println(another.getClass.getName) // scala.collection.immutable.Set



  }

}
