package lectures.week2oop // [Объекты]

object ObjectsOOP extends App {
  object Number {
    val Pi = 3.14
  }

  println(Number.Pi)

  class MyString(val str: String) {
    private var extra = "extraData"
    override def toString: String = str + extra
  }

  object MyString {
    def apply(base: String, extras: String): MyString = {
      val s = new MyString(base)
      s.extra = extras
      s
    }

    def apply(base: String) = new MyString(base)
  }

  // опускаем наименование метода apply и сразу пишем необхоимые для этого метода параметры
  println(MyString("hello", "world")) // helloworld
  println(MyString("welcome")) // welcomeextraData


  class Person(name: String)

  object Person {
    val age = 30
  }

  val bob = new Person("Bob")
  println(Person.age)

//  class PersonalAccount
//
//  class BusinessAccount
//
//  class Branch {
//    def openAccount(accountType: String) = {
//      if (accountType == "business") new BusinessAccount
//      else new PersonalAccount
//    }
//  }
//
//
//  val branch = new Branch()
//  val account = branch.openAccount("business")

  class Pizza private {
    override def toString = "This is pizza"
  }

  object Pizza {
    val pizza = new Pizza

    def getInstance: Pizza = {
      pizza
    }
  }

  object TestPizza extends App {

    val pizza = Pizza.getInstance // Именно поэтому удается через объект создать экземпляр класса Pizza т.к. объект и класс являются компаньонами

    println(pizza) // для .toString существует синтаксический сахар, поэтому println(pizza) на самом деле println(pizza.toString)
  }



}
