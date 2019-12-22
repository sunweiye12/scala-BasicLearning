package _14异常捕获
import java.io._
/**
Scala 抛出异常的方法和 Java一样，使用 throw 方法，例如，抛出一个新的参数异常
  catch是按次序捕捉的。因此，在catch字句中，越具体的异常越要靠前，越普遍的异常越靠后。 如果抛出的异常不在catch字句中，该异常则无法处理，会被升级到调用者处
 */

// test
object MyException{

  def main(args: Array[String]) {

    println("-------异常捕获-----")
//    val f = new FileReader("input.txt")  报错了
    try {
      val f = new FileReader("input.txt")   // 在获取一个本地文件的时候可能发生错误
    } catch {     // 在catch中捕获异常并打印出来
      case ex: FileNotFoundException =>{
        println("Missing file exception："+ex)
      }
      case ex: IOException => {
        println("IO Exception："+ex)
      }
    } finally {   // 一定会执行的部分
      println("Exiting finally...")
    }
  }
}
