package lectures.week2oop // [Классы]

object ClassesOOP extends App {



  val student = new Student(id = 0, name = "Bob")
  println(student.name)

}

class Student(id: Int, val name: String){
  // Параметр конструктора становится полем класса только после добавления в объявление val или var
  val uni = "University"

  println("Student class")
}

