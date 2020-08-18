package _16多线程

import java.util.concurrent.{Executors, ExecutorService}
object test {
  def main(args: Array[String]) {
    //创建线程池
    val threadPool:ExecutorService=Executors.newFixedThreadPool(5)
    try {
      //提交5个线程
      for(i <- 1 to 5){
        //threadPool.submit(new ThreadDemo("thread"+i))
        threadPool.execute(new ThreadDemo("thread"+i))
      }
    }finally {
      threadPool.shutdown()
    }
  }
  //定义线程类，每打印一次睡眠100毫秒
  class ThreadDemo(threadName:String) extends Runnable{
    override def run(){
      for(i <- 1 to 10){
        println(threadName+"|"+i)
        Thread.sleep(100)
      }
    }
  }
}