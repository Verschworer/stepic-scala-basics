package lectures.week1basics

object Functions extends App {
//  def aPerson(name: String, surname: String): String = {
//    s"$name $surname"
//  }
//  println(aPerson("John", "Smith"))

//  def aPerson(name: String, surname: String): Unit = println(s"$name $surname")
//
//  aPerson("John" , "Smith")

//  def aParameterlessFunction(): Unit = println("Function with no parameters")
//
//  aParameterlessFunction()
//  aParameterlessFunction

//  def aFunctionWithDefaultParameter(x: Int, y: String = "Default Parameter"): String = {
//    s"x = $x and y = $y"
//  }
//
//  println(aFunctionWithDefaultParameter(1)) // выводит x = 1 and y = Default Parameter

  def callByValue(x: Long): Unit = {
    println(s"call by value: x1 = $x")
    println(s"call by value: x2 = $x")
  }

  def callByName(x: => Long): Unit = {
    println(s"call by name: x1 = $x")
    println(s"call by name: x2 = $x")
  }

  callByValue(System.nanoTime()) // System.nanoTime() возвращает время выполнения в наносекундах.
  callByName(System.nanoTime()) // System.nanoTime() возвращает время выполнения в наносекундах.
}