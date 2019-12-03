package _05控制语句

/*
if，while，for
 */
object demo5 {
  def main(args: Array[String]): Unit = {

    // if条件控制语句
    var data = 10
    if(data > 10){
      println("data数据大于20")
    } else if (data < 0) {
      println("data数小于0")
    } else  {
      println("data数据在0和20 之间")
    }

    // for循环语句
    // 遍历1-10到数据（to包含10）
    for( a <- 1 to 10){
      print( " " + a );
    }
    println("")

    //until不包含10
    for( a <- 1 until 10){
      print( " " + a );
    }
    println("")

    //在 for 循环 中你可以使用分号 (;) 来设置多个区间
    for( a <- 1 to 3; b <- 1 to 3){  // 相当于是两层for循环 （1，1）（1，2）（1，3）（2，1）（2，2）（2，3）（3，1）（3，2）（3，3）
      print( " " + a );
      print( " " + b );
      print("，")
    }
    println()

    //遍历集合到方式
    val numList = List(1,2,3,4,5,6);
    for( a <- numList ){
      print( " " + a );
    }
    println()

    // for循环中增加条件
    // for 循环
    for( a <- numList
         if a != 3; if a < 4 ){
      print( " " + a );
    }
    println()

    // for 使用 yield ,可以用yield函数将循环到变量保存下来(注意此处用大括号)
    var retVal = for{ a <- numList
                      if a != 3; if a < 6
                      }yield a
    // 输出返回值
    for( a <- retVal){
      print( " " + a );
    }
    println()

    // whilex循环
    // while 循环执行
    var a = 0
    while( a < 20 ){
      print( " " + a );
      a = a + 1;
    }
    println()

    // do 循环
    a = 0
    do{
      print( " " + a );
      a = a + 1;
    }while( a < 20 )
    println("end")


  }
}
