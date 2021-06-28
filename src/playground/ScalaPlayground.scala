package playground

import scala.annotation.tailrec
object ScalaPlayground extends App {
//  println("Hello, Scala!")
//  val aNumber = if(('1' +: "23").toInt == 24) 24 else 123
//  val aNumber = if ("string".length == 6 & 1 < 2) & ('1' +: "23" :+ '4').toInt == 1234  24 else 123
//  println(aNumber)

//val someValue = {
//  1 < 0
//  2 == 5
//  4 < 9
//}
//
//  val someCodeBlock = {
//    if (someValue) 1 else 0
//    0
//  }
//
//  println(someCodeBlock) // 0

  // исправьте код
//  def aCondition(): Boolean = if ( 1 > 2) true else false
//
//  def someFunnc(x: Int, y: => Int): Unit = {
//    if (aCondition) x * 2
//    else  (2 * y)
//  }
//  someFunnc(3, 4)


//  def XplusNY(x: => Int, y: => Int, n: => Int): Int = {
//    @tailrec
//    def _XplusNY(t: Int, ac: Int = x): Int = {
//      if (t <= 0) ac
//      else _XplusNY(t - 1, y + ac)
//
//    }
//
//    _XplusNY(n)
//
//  }
//
//  def repeatRes(res: Int): String = {
//    @tailrec
//    def _repeatRes(i: Int, acc: String = res.toString ++: " is the result"): String = {
//      if (i <= 1) acc
//      else _repeatRes(i - 1, s"$res $acc")
//    }
//
//    _repeatRes(res.toString.toCharArray.size)
//
//  }
//
//  println(repeatRes(XplusNY(10000, 1, 4)))

//  def revs(s: String): String = {
//    if (s.length == 1)  s
//    else revs(s.tail) + s.head
//
//
//  }

//  def revStr(string: String): String = string.toList.map{.split(" ")}.map{.reverse}
//    .map(.mkString(" "))

  val input = "I like     Scala"
  val s = input.replaceAll(" +", " ").split(" ").toList.reverse.mkString(" ")

  println(s)
}
