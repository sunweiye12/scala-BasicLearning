package _10集合

/*
Scala 列表类似于数组，它们所有元素的类型都相同，但是它们也有所不同：列表是不可变的，值一旦被定义了就不能改变，其次列表 具有递归的结构（也就是链接表结构）而数组不是
 */
object mylist {

  def main(args: Array[String]): Unit = {
    println("list列表集合--")

    // 字符串列表
    val site = List("Runoob", "Google", "Baidu")
    // 整型列表
    val nums: List[Int] = List(1, 2, 3, 4)
    // 空列表
    val empty: List[Nothing] = List()
    // 二维列表
    val dim: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
      )

    println(site)
    println(dim)

    // 构造列表的两个基本单位是 Nil 和 ::       **** Nil 也可以表示为一个空列表。
    // 字符串列表
    val site1 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))

    // 整型列表
    val nums1 = 1 :: (2 :: (3 :: (4 :: Nil)))

    // 空列表
    val empty1 = Nil

    // 二维列表
    val dim1 = (1 :: (0 :: (0 :: Nil))) ::
      (0 :: (1 :: (0 :: Nil))) ::
      (0 :: (0 :: (1 :: Nil))) :: Nil
    println(site1)
    println(nums1)
    println(dim1)

    // 列表到拼接 ---> 使用 ::: 运算符或 List.:::() 方法或 List.concat()

    var list = List(1,2,3,4,5)
//    list = list.::(9)   // 在列表开头添加元素
//    list = list.:::(List(0,1))  // 在头部添加列表
//    list = list.:+(55)    // 在胃部追加元素
//    list = list.+:(55)    // 在开头 追加元素
    var last1 = list.last
    var last2 = list.head

//    var ind = list.indexOf(55)

//    list = list.tail
//    list = list.init
    println(list)
//    println(ind)
//    println(last1)
//    println(last2)


  }

}
