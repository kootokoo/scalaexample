package example.Implicitparameters

/**
  * Created by koo on 2017. 2. 19..
  */
class ImplicitParameters {

}

abstract class SemiGroup[A] {
  def add(x:A, y:A):A
}

abstract class Monoid[A] extends SemiGroup[A] {
  def unit:A
}

object ImplicitParameters extends App {

}

