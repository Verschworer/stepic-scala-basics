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

//  val input = "I like     Scala"
//  val s = input.replaceAll(" +", " ").split(" ").toList.reverse.mkString(" ")
//
//  println(s)

//  class Student(val name: String)
//
//  class Course(val title: String, val instructor: String) {
//    val id = "cs_101"
//    println(id)
//  }
//
//  val course = new Course("Scala", "Bob")
//  val student = new Student("Sam")


//  class Instructor (val id: Int, val name: String, val surname: String){
//    def fullName() : String = s"${name.charAt(0).toUpper + name.substring(1).toLowerCase} " +
//      s"${surname.charAt(0).toUpper + surname.substring(1).toLowerCase}"
//  }
//
//  class Course(val courseID: Int, val title: String, val releaseYear: String, val instructor: Instructor){
//    def getID() : String = s"$courseID${instructor.id}"
//
//    def isTaughtBy(instructor: Instructor): Boolean = {
//      if (instructor == this.instructor) true
//      else false
//    }
//
//    def copyCourse(newReleaseYear: String) = new Course(
//      courseID = this.courseID,
//      title = this.title,
//      releaseYear = newReleaseYear,
//      instructor = this.instructor)
//
//  }
//
//
//
//  val krip = new Instructor(id = 1, name = "sergEy", surname = "kREpKOV")
//  val kc = new Course(courseID = 9, title = "knifecombat", releaseYear = "2021", instructor = krip)
//
//
//  println(krip.fullName())
//  println(kc.getID())
//  println(kc.isTaughtBy(krip))
//  val copy_kc = kc.copyCourse("2022")

//  class Person(val name: String) {
//    def unary_+ : Person = new Person(Person.this.name + s" noSurname")
//  }
//
//
//  val person = new Person("Bob")
//
//  println((+person).name)

//  case class Course(title: String, instructor: String)
//
//  object Course {
//    def apply(instructor: String): Course = Course("AdvancedScala", instructor)
//  }
//
//  val scalaCourse = Course("Scala", "Bob")

//  val course = new Course("Scala") // -
//  val course = new Course("Scala", "Bob") // +
//  val course = Course("Scala", "Bob") // +
//  val course = scalaCourse.copy("AdvancedScala") // +
//  val course = scalaCourse.copy() // +
//  val course = Course("Alice") // +


  object A {
    val a: String = "value a"
    println("object A")
  }

  val aVal = A
  val anotherVal = A

  println(aVal.a)
  println(anotherVal.a)




}
