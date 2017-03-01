package example.variances

/**
  * Created by koo on 2017. 2. 12..
  */
object VarianceTest extends App{
//  var s: Stack[Any] = new Stack().push("hello")
//  s = s.push(new Object())
//  s = s.pop
//  s = s.push(7)

//  println(s)

  var q : Queue[Any] = new Queue().put("hi")
  println(q)


}

class Stack[+A] {
  def push[B >: A](elem: B): Stack[B] = new Stack[B] {
    override def top: B = elem
    override def pop: Stack[B] = Stack.this
    override def toString() = elem.toString() + " " + Stack.this.toString()

  }
  def top: A = sys.error("no element on stack")
  def pop: Stack[A] = sys.error("no element on stack")
  override def toString() = ""

}


class Queue[+A] {
  def put[B >: A](elem: B) :Queue[B] = new Queue[B] {
    override def put[B >: A](elem: B): Queue[B] = super.put(elem)
    override def clone(): AnyRef = super.clone()
  }



}
