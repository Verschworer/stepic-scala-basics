package lectures.week1basics

object Recursion extends App {
  //  var i: Int = 0
  //
  //  def inc(x: Int): Int = {
  //    i += x
  //    i
  //  }
  //
  //  println(inc(1)) // 1
  //  println(inc(2)) // 3

  //  var i = 0
  //  while (i < 3) {
  //    println("hello")
  //    i += 1
  //  }

  //  def factorial(n: Int): Int = {
  //    if (n <= 0) 1
  //    else n * factorial(n - 1)
  //  }
  //
  //  println(factorial(3)) // выводит 6

  //  def factorial(n: Int): Int = {
  //    if (n <= 0) 1
  //    else {
  //      println(s"Имеем число $n, для которого считаем факториал ${n-1}")
  //      var res = n * factorial(n-1)
  //      println(s"Вычислили факториал $n")
  //
  //      res
  //    }
  //  }
  //
  //  factorial(3)

  //  def factorialWithTailRecursion(n: Int): Int = {
  //    def loop(x: Int, accumulator: Int = 1): Int = {
  //      if (x <= 1) accumulator
  //      else loop(x-1, x*accumulator)
  //    }
  //
  //    loop(n)
  //  }
  //
  //  println(factorialWithTailRecursion(20))

  import scala.annotation.tailrec
  //
  //
  //  def factorialWithTailRecursion(n: Int): Int = {
  //    @tailrec
  //    def loop(x: Int, accumulator: Int = 1): Int = {
  //      if (x <= 1) accumulator
  //      else loop(x-1, x*accumulator)
  //    }
  //
  //    loop(n)
  //  }
  //
  //  println(factorialWithTailRecursion(34))

  def repeatWord(word: String, n: Int): String = {
    @tailrec
    def loop(i: Int, acc: String = word): String = {
      if (i <= 1) acc
      else loop(i - 1, s"$word $acc")
    }

    loop(n)

  }

  println(repeatWord("hello", 5))

}
