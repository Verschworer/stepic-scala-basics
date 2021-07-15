package exercises


object LinkedList extends App {
  abstract class LogList {

    def add(msg: Any): LogList
    def all(): Any
    def last(): Any
    def previous(): LogList
    def isEmpty(): Boolean
  }

  class Log(head: Any, tail: LogList) extends LogList {

    def add(msg: Any): LogList = new Log(msg, this)
    def all(): Any = s"$head ${tail.all()}"
    def last(): Any = Log.this.head
    def previous(): LogList = Log.this.tail
    def isEmpty(): Boolean = false
  }

  object Empty extends LogList{

    def add(msg: Any): LogList = new Log(msg, Empty)
    def all(): Any = ""
    def last(): Nothing = throw new NoSuchElementException
    def previous(): Nothing = throw new NoSuchElementException
    def isEmpty(): Boolean = true
  }

  /*
  abstract class LogList[+A] {
    def add[B >: A](msg: B): LogList[B] // добавляет сообщение в список
    def previous: LogList[A]            // возвращает все ранее поступившие собщения(tail), за исключением head
    def all: String                     //содержимое списка в виде строки
    def isEmpty: Boolean                //проверяет, если ли списке сообщения
    def last: A                         //возвращает последнее поступившее сообщение (иначе говоря - head списка)
  }

  class Log[+A](head: A, tail: LogList[A]) extends LogList[A]{
    def add[B >: A](msg: B): LogList[B] = new Log(msg, this)
    def previous: LogList[A] = tail
    def all: String = head + " " + tail.all
    def isEmpty: Boolean = {
      if (head == "") true
      else false
    }
    def last: A = head
  }

  object Empty extends LogList[Nothing] {
    override def add[B >: Nothing](msg: B): LogList[B] = new Log(msg, Empty)
    override def previous: LogList[Nothing] = throw new NoSuchElementException
    def all: String = ""
    def last: Nothing  = throw new NoSuchElementException
    def isEmpty : Boolean = true
  }
  */

//  val list = new Log("INFO_1", Empty)
  val list = new Log("INFO_1", new Log("INFO_2", new Log("INFO_3", Empty)))
  println(list.isEmpty())

}
