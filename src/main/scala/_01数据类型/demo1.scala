package _01数据类型

/*
### 数据类型都是对象，也就是说scala没有java中的原生类型。数字基础类型是可以调用方法的
Byte	    8位有符号补码整数。数值区间为 -128 到 127
Short	    16位有符号补码整数。数值区间为 -32768 到 32767
Int	      32位有符号补码整数。数值区间为 -2147483648 到 2147483647
Long	    64位有符号补码整数。数值区间为 -9223372036854775808 到 9223372036854775807
Float	    32 位, IEEE 754 标准的单精度浮点数
Double	  64 位 IEEE 754 标准的双精度浮点数
Char	    16位无符号Unicode字符, 区间值为 U+0000 到 U+FFFF
String	  字符序列
Boolean	  true或false
Unit	    表示无值，和其他语言中void等同。用作不返回任何结果的方法的结果类型。Unit只有一个实例值，写成()。
Null	    null 或空引用
Nothing	  Nothing类型在Scala的类层级的最底端；它是任何其他类型的子类型。
Any	      Any是所有其他类的超类
AnyRef	  AnyRef类是Scala里所有引用类(reference class)的基类
 */
object demo1 {
  def main(args: Array[String]): Unit = {
    /*整型字面量用于 Int 类型，如果表示 Long，可以在数字后面添加 L 或者小写 l 作为后缀*/
    println("整型")
    var myInt : Int = 1
    var myLong : Long = 12L
    println(myInt,myLong)

    /*浮点数后面有f或者F后缀时，表示这是一个Float类型，否则就是一个Double类型的*/
    println("浮点型")
    var myDouble : Double = 13.5
    var myFlaot : Float = 12.1F
    println(myDouble,myFlaot)

    println("字符串")
    var myString : String = "hello world"
    var myShi : String =
      """床前明月光
一是大学生
      """
    println(myString)
    println(myShi)

    println("转义字符")
    /*
    \b	\u0008	退格(BS) ，将当前位置移到前一列
    \t	\u0009	水平制表(HT) （跳到下一个TAB位置）
    \n	\u000a	换行(LF) ，将当前位置移到下一行开头
    \f	\u000c	换页(FF)，将当前位置移到下页开头
    \r	\u000d	回车(CR) ，将当前位置移到本行开头
    \"	\u0022	代表一个双引号(")字符
    \'	\u0027	代表一个单引号（'）字符
  \\	\u005c	代表一个反斜线字符 '\'
     */


  }
}
