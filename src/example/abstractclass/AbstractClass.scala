package example.abstractclass

/**
  * Created by koo on 2017. 2. 19..
  */
object AbstractClass extends App{
  def newIntSeqBuf(e1:Int, e2:Int): SeqBuffer[Int,Seq[Int]] =
    new SeqBuffer[Int,List[Int]] {
      val element = List(e1,e2)
    }
  val buf = newIntSeqBuf(7,8)
  println("length = " + buf.length)
  println("content = " + buf.element)
}

abstract class Buffer[+T] {
  val element: T
}
abstract class SeqBuffer[U, +T <: Seq[U]] extends Buffer[T] {
  def length = element.length
}
