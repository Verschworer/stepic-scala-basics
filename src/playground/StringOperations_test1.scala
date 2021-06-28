package playground

object StringOperations_test1 extends App {
  var aString = "Scala course"

//  println(aString.charAt(11)) // 1 ok
//  println(aString.substring(11, 12)) // 1 ok


//  println(aString.substring(0, 5).toUpperCase) // 2 ok
//  println(aString.toUpperCase.substring(0, 5)) // 2 ok
//  println(aString.take(5).toUpperCase) // 2 ok

  println(aString.replace("a", "").take(3).reverse)

}
