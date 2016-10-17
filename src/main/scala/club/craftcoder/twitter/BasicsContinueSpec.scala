package club.craftcoder.twitter

object BasicsContinueSpec {

  class Car(brandS: String, colorS: String) {
    val brand: String = brandS
    val color: String = colorS
  }

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

  //noinspection ScalaStyle
  private def patternMatching(num: Int): String = {
    num match {
      case 0 => "zero"
      case 5 => "five"
      case _ => "other num"
    }
  }

  /**
    * 使用守卫进行匹配
    */
  private def patternMatching(num: Long): String = {
    num match {
      case i if i == 0 => "one"
      case i if i == 5 => "five"
      case _ => "other num"
    }
  }

  /**
    * 类型匹配
    */
  private def testType(o: Any): Any = {
    o match {
      case i: Int if i < 0 => i - 1
      case i: Int => i + 1
      case d: Double if d < 0.0 => d - 0.1
      case d: Double => d + 1
      case text: String => text + "s"
    }
  }

  private def carPrice(car: Car) = car match {
    case _ if car.brand == "BMW" && car.color == "black" => 300000.00
    case _ if car.brand == "BMW" && car.color == "red" => 400000.00
    case _ if car.brand == "BMW" && car.color == "yellow" => 350000.00
  }

  // case classes
  case class PrintMachine(brand: String, model: String)

  // test PrintMachine
  private def calcPrintType(calc: PrintMachine) = calc match {
    case PrintMachine("HP", "20b") => "financial"
    case PrintMachine("HP", "48g") => "scientific"
    case PrintMachine("HP", "30b") => "business"
    case PrintMachine(ourBrand, ourModel) => "Calculator: %s %s is of unknown type".format(ourBrand, ourModel)
  }

  // test try catch finally
  //  try {
  //    remoteCalculatorService.add(1, 2)
  //  } catch {
  //    case e: ServerIsDownException => log.error(e, "the remote calculator service is unavailable. should have kept your trusty HP.")
  //  } finally {
  //    remoteCalculatorService.close()
  //  }

  // === or === //
  //  val result: Int = try {
  //    remoteCalculatorService.add(1, 2)
  //  } catch {
  //    case e: ServerIsDownException => {
  //      log.error(e, "the remote calculator service is unavailable. should have kept your trusty HP.")
  //      0
  //    }
  //  } finally {
  //    remoteCalculatorService.close()
  //  }

  //noinspection ScalaStyle
  def main(args: Array[String]): Unit = {
    //apply methods
    val newFoo = new FooMaker()
    println(newFoo)

    // Objects
    println(Timer.currentCount())

    println("5 is : " + patternMatching(5))

    println("Long 5 is : " + patternMatching(5L))

    println(testType(0.2))
    println(testType(2))
    println(testType("test"))

    val car = new Car("BMW", "yellow")
    println(carPrice(car))

    // test case classes
    val hp20b = PrintMachine("HP", "20b")
    val hp20B = PrintMachine("HP", "20b")
    println(hp20B == hp20b)
    println(calcPrintType(hp20b))

  }
}
