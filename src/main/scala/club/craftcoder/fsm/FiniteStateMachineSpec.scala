package club.craftcoder.fsm

//noinspection ScalaStyle
object FiniteStateMachineSpec {

  class AirMachine {
    var state = 0

    def getState(): Int = state

    def power(): Unit = {
      if (state == 0) {
        state = 1
        println("start fan")
      } else if (state == 1) {
        state = 0
        println("stop fan")
      } else {
        state = 0
        println("stop cool")
      }
    }

    def cool(): Unit = {
      if (state == 0) {
        println("nothing")
      } else if (state == 1) {
        state = 2
        println("start cool")
      } else {
        state = 1
        println("stop cool")
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val air = new AirMachine
    println(s"current state: " + air.state)
    air.cool()
    println(s"current state: " + air.state)
    air.power();
    println(s"current state: " + air.state)
    air.cool();
    println(s"current state: " + air.state)
    air.cool();
    println(s"current state: " + air.state)
    air.power();
    println(s"current state: " + air.state)
    air.power();
    println(s"current state: " + air.state)
  }


}
