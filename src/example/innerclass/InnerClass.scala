package example.innerclass

/**
  * Created by koo on 2017. 2. 12..
  */
object InnerClass {
  val g = new Graph
  val n1 = g.newNode
  val n2 = g.newNode
  val n3 = g.newNode
}

class Graph {
  class Node {
    var connectedNodes: List[Node] = Nil
    def connectTo(node: Node): Unit = {
      if(connectedNodes.find(node.equals).isEmpty) {
        connectedNodes = node ::connectedNodes
      }
    }
  }

  var nodes: List[Node] = Nil
  def newNode: Node = {
    val res = new Node
    nodes = res ::nodes
    res
  }
}
