package _09数组
import Array._
/*
Scala 语言中提供的数组是用来存储固定大小的同类型元素，
 */
object demo9 {

  def main(args: Array[String]): Unit = {
    println("数组--")
    // 声明一个数组到方式
    var z1:Array[String] = new Array[String](3)
    var z2 = new Array[String](3)
    z1(0) = "Runoob"; z1(1) = "Baidu"; z1(4/2) = "Google" //赋值
    var z3 = Array("Runoob", "Baidu", "Google")  //声明并赋值

    // 处理数组
    var myList = Array(1.9, 2.9, 3.4, 3.5)
    // 输出所有数组元素
    for ( x <- myList ) {
      println( x )
    }

    // 计算数组所有元素的总和
    var total = 0.0;
    for ( i <- 0 to (myList.length - 1)) {
      total += myList(i);
    }
    println("总和为 " + total);

    // 查找数组中的最大元素
    var max = myList(0);
    for ( i <- 1 to (myList.length - 1) ) {
      if (myList(i) > max) max = myList(i);
    }
    println("最大值为 " + max);


    // 二维数组(需要导入Array包)
    var myMatrix = ofDim[Int](3,3)
    // 为创建矩阵赋值
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        myMatrix(i)(j) = j;
      }
    }
    // 打印二维阵列
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        print(" " + myMatrix(i)(j));
      }
      println();
    }

    // 利用concat（）函数来合并两个数组
    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)
    var myList3 =  concat( myList1, myList2)
    // 输出所有数组元素
    for ( x <- myList3 ) {
      print( x + ", " )
    }
    println()

    // 利用range（）函数来获取到一个固定步长到数组
    var myList4 = range(10, 20, 2)
    var myList5 = range(10,20)

    // 输出所有数组元素
    for ( x <- myList4 ) {
      print( " " + x )
    }
    println()
    for ( x <- myList5 ) {
      print( " " + x )
    }

    // 数组中方法
    /**
     * def apply( x: T, xs: T* ): Array[T]  创建指定对象 T 的数组, T 的值可以是 Unit, Double, Float, Long, Int, Char, Short, Byte, Boolean
     * def concat[T]( xss: Array[T]* ): Array[T]  合并数组
     * def copy( src: AnyRef, srcPos: Int, dest: AnyRef, destPos: Int, length: Int ): Unit  复制一个数组到另一个数组上
     * def empty[T]: Array[T] 返回长度为 0 的数组
     * def fill[T]( n: Int )(elem: => T): Array[T]  返回数组，长度为第一个参数指定，同时每个元素使用第二个参数进行填充
     * def ofDim[T]( n1: Int ): Array[T]  创建指定长度的数组
     * def ofDim[T]( n1: Int, n2: Int ): Array[Array[T]]    创建二维数组
     * def range( start: Int, end: Int, step: Int ): Array[Int] 创建指定区间内的数组，step 为每个元素间的步长
     *
     *
     */



  }

}
