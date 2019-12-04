package _08字符串

/*
字符串：在 Scala 中，String 是一个不可变的对象，所以该对象不可被修改。这就意味着你如果修改字符串就会产生一个新的字符串对象。
但其他对象，如数组就是可变的对象。
 */
object demo8 {

  def main(args: Array[String]): Unit = {
    println("字符串--")
    // 定义字符串
    var greeting:String = "你好世界"
    var greeting1 = "hello world"
    println(greeting+greeting1)

    // 创建一个可以修改的字符串，可以使用 String Builder 类
    val buf = new StringBuilder("aa"); // 创建StringBuilder类
    buf += 'q'    // 追加字符 +=
    buf ++= "bcdef"  // 追加字符串 ++=
    println( "buf is : " + buf.toString );

    // length()函数来获取到字符串到长度
    var palindrome = "www.runoob.com";
    var len = palindrome.length();
    println( "String Length is : " + len );

    // 格式化字符串来输出
    var floatVar = 12.456
    var intVar = 2019
    var stringVar = "菜鸟教程!"
    var fs = printf("浮点型变量为 %f, 整型变量为 %d, 字符串为 %s", floatVar, intVar, stringVar)
    println(fs)

  }
  /*

char charAt(int index)    返回指定位置的字符
int compareTo(Object o)   比较字符串与对象
int compareTo(String anotherString)   按字典顺序比较两个字符串
int compareToIgnoreCase(String str)   按字典顺序比较两个字符串，不考虑大小写
String concat(String str)   将指定字符串连接到此字符串的结尾
boolean contentEquals(StringBuffer sb)    将此字符串与指定的 StringBuffer 比较。
static String copyValueOf(char[] data)    返回指定数组中表示该字符序列的 String
static String copyValueOf(char[] data, int offset, int count)   返回指定数组中表示该字符序列的 String
boolean endsWith(String suffix)   测试此字符串是否以指定的后缀结束
boolean equals(Object anObject)   将此字符串与指定的对象比较
boolean equalsIgnoreCase(String anotherString)    将此 String 与另一个 String 比较，不考虑大小写
byte getBytes()   使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中
byte[] getBytes(String charsetName    使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中
void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)   将字符从此字符串复制到目标字符数组
int hashCode()    返回此字符串的哈希码
int indexOf(int ch)   返回指定字符在此字符串中第一次出现处的索引
int indexOf(int ch, int fromIndex)    返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索
int indexOf(String str)   返回指定子字符串在此字符串中第一次出现处的索引
int indexOf(String str, int fromIndex)    返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始
String intern()   返回字符串对象的规范化表示形式
int lastIndexOf(int ch)   返回指定字符在此字符串中最后一次出现处的索引
int lastIndexOf(int ch, int fromIndex)    返回指定字符在此字符串中最后一次出现处的索引，从指定的索引处开始进行反向搜索
int lastIndexOf(String str)   返回指定子字符串在此字符串中最右边出现处的索引
int lastIndexOf(String str, int fromIndex)    返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索
int length()    返回此字符串的长度
boolean matches(String regex)   告知此字符串是否匹配给定的正则表达式
boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)    测试两个字符串区域是否相等
boolean regionMatches(int toffset, String other, int ooffset, int len)    测试两个字符串区域是否相等
String replace(char oldChar, char newChar)    返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的
String replaceAll(String regex, String replacement    使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串
String replaceFirst(String regex, String replacement)   使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串
String[] split(String regex)    根据给定正则表达式的匹配拆分此字符串
String[] split(String regex, int limit)   根据匹配给定的正则表达式来拆分此字符串
boolean startsWith(String prefix)   测试此字符串是否以指定的前缀开始
boolean startsWith(String prefix, int toffset)    测试此字符串从指定索引开始的子字符串是否以指定前缀开始。
CharSequence subSequence(int beginIndex, int endIndex)    返回一个新的字符序列，它是此序列的一个子序列
String substring(int beginIndex)    返回一个新的字符串，它是此字符串的一个子字符串
String substring(int beginIndex, int endIndex)    返回一个新字符串，它是此字符串的一个子字符串
char[] toCharArray()    将此字符串转换为一个新的字符数组
String toLowerCase()    使用默认语言环境的规则将此 String 中的所有字符都转换为小写
String toLowerCase(Locale locale)   使用给定 Locale 的规则将此 String 中的所有字符都转换为小写
String toString()   返回此对象本身（它已经是一个字符串！）
String toUpperCase()    使用默认语言环境的规则将此 String 中的所有字符都转换为大写
String toUpperCase(Locale locale)     使用给定 Locale 的规则将此 String 中的所有字符都转换为大写
String trim()     删除指定字符串的首尾空白符
static String valueOf(primitive data type x)  返回指定类型参数的字符串表示形式
   */

}
