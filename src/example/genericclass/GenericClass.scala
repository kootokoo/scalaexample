package example.genericclass

/**
  * Created by koo on 2017. 2. 12..
  */
class GenericClass {


}

class Stack[T] {
  var elements : List[T] = Nil
  def push(x: T) { elements = x :: elements }
  def top: T = elements.head;
  def pop() {elements = elements.tail }
}


object GenericTest extends App {
  val stack = new Stack[Int]
  stack.push(1)
  stack.push('a')
  println(stack.top)
  stack.pop()
  println(stack.top)
}