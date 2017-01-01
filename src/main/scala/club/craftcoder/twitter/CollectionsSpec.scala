package club.craftcoder.twitter

class CollectionsSpec extends BasicSpec {

  test("create list test") {
    val numbers = List(1, 2, 3, 4)
    //    numbers.foreach{
    //      num => println(num)
    //    }
      assert(numbers.size == 4)
  }

  test("An empty Set should have size 0") {
    assert(Set.empty.size == 0)
  }
}