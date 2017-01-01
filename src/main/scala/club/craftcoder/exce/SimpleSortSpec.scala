package club.craftcoder.exce

object SimpleSortSpec {

  def qSort(a: List[Int]): List[Int] = {
    if (a.length < 2) {
      a
    } else {
      qSort(a.filter(_ < a.head)) ++
        a.filter(_ == a.head) ++
        qSort(a.filter(_ > a.head))
    }
  }

  def main(args: Array[String]): Unit = {
    println(qSort(List(4,456,56,7,8,999,77)))
  }

}
