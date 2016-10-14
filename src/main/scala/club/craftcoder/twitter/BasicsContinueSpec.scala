package club.craftcoder.twitter

object BasicsContinueSpec {

  //noinspection ScalaStyle
  class Foo() {}

  //noinspection ScalaStyle
  class FooMaker() {
    def apply() = new Foo
  }

  // Objects
  object Timer {
    var count = 0

    def currentCount(): Long = {
      count += 1
      count
    }
  }

  private def patternMatching(num: Int): String ={
    num match {
      case 0 => "zero"
      case 5 => "five"
      case _ => "other num"
    }
  }

  //noinspection ScalaStyle
  def main(args: Array[String]): Unit = {
    //apply methods
    val newFoo = new FooMaker()
    println(newFoo)

    // Objects
    println(Timer.currentCount())

    println("5 is : " + patternMatching(5))

  }
}
