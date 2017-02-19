package example

/**
  * Created by koo on 2017. 1. 28..
  */

class Point(xc: Int, yc: Int) extends Similarity {
  var x: Int = xc
  var y: Int = yc

  override def isSimilar(obj: Any) =
    obj.isInstanceOf[Point] &&
    obj.asInstanceOf[Point].x == x

}



trait Similarity {
  def isSimilar(x: Any): Boolean
  def isNotSimilar(x: Any): Boolean = !isSimilar(x)

}


object TraitsTest extends App {
  val p1 = new Point(2,3)
  val p2 = new Point(2,4)

  println(p1.isSimilar(p2))

}