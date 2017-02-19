package example

/**
  * Created by koo on 2017. 1. 29..
  */
class HigherOrderFunctions(left:String, right:String) {
  def layout[A] (x:A) = left + x.toString + right

}

object FunTest extends App {
  def  apply(f: Int => String, v:Int  ) = f(v)
  val decorator = new HigherOrderFunctions("[","]")
  println(apply(decorator.layout,7))

}


