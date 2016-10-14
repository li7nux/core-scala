package club.craftcoder.regex

import scala.util.matching.Regex

object RegexSpc {

  //noinspection ScalaStyle
  def main(args: Array[String]): Unit = {
    val regex="""([0-9]+) ([a-z]+)""".r
    val line = "1024 program"
    val regex(num, string) = line
    println(s"""num is: $num, string is : $string""")

    val m = regex.findAllIn(line)
    println(m)
    println(m.group(1) + "\t" + m.group(2))

    println(m.toArray)

    val regex1 = new Regex("""([0-9]+) ([a-z]+)""")
    val regex1(num1, string1) = line
    println(s"""num is: $num1, string is : $string1""")

    val line1 = "10111$$$123"
    line1 match {
      case regex(num, string) => println(s"""num is: $num, string is : $string""")
      case _ => println("not match regex ...")
    }

  }

}
