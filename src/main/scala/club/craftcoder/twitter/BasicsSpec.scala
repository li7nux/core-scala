package club.craftcoder.twitter

object BasicsSpec {

  class Calculator {
    val brand: String = "HP"

    def add(m: Int, n: Int): Int = m + n
  }

  class Car(brand: String) {
    val color: String = if (brand == "Ferrari") {
      "red"
    } else if (brand == "Lamborghini") {
      "yellow"
    } else {
      "white"
    }

    // An instance method.
    def add(m: Int, n: Int): Int = m + n
  }

  //noinspection ScalaStyle
  class C {
    var acc = 0

    def minc = {
      acc += 1
    }

    val finc = { () => acc += 1 }
  }

  //noinspection ScalaStyle
  class NewCar(brand: String) extends Car(brand) {
    def log(m: Double, base: Double) = math.log(m) / math.log(base)
  }

  class MagicCar(brand: String) extends NewCar(brand) {
    def log(m: Int): Double = log(m, math.exp(1))
  }

  abstract class Shape {
    def getArea(): Int
  }

  class Circle(r: Int) extends Shape {
    override def getArea(): Int = {
      r * r * 3
    }
  }

  trait CarBrand{
    val brand: String
  }

  trait Price{
    val price: Double
  }

  class BMW extends CarBrand with Price{
    val brand = "BMW"
    val price = 350000.00
  }

  //noinspection ScalaStyle
  def main(args: Array[String]): Unit = {
    // Constructor
    val calc = new Calculator
    println(calc.brand)
    println(calc.add(4, 9))

    // car
    var car = new Car("Ferrari")
    println(car.color)
    car = new Car("Lamborghini")
    println(car.color)
    println(car.add(14, 15))

    // Expressions
    val c = new C
    println(c.minc)
    println(c.finc)

    // Extends
    val newCar = new NewCar("BMW")
    println(newCar.color)
    println(newCar.log(25, 5))

    // Overloading methods
    val magicCar = new MagicCar("Lamborghini")
    println(magicCar.color)
    println(magicCar.log(25, 5))

    // Abstract Classes
    val circle = new Circle(2)
    println(circle.getArea())

    // Traits
    val bmwCar = new BMW
    println(bmwCar.brand)
    println(bmwCar.price)

  }

}
