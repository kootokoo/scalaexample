//package example.explicitlytypedselfreferences
//
///**
//  * Created by koo on 2017. 2. 19..
//  */
//class ExplicityType {
//
//
//}
//
//abstract class Graph {
//  type Edge
//  type Node <: NodeIntf
//  abstract class NodeIntf {
//    def connectedWith(node: Node): Edge
//  }
//  def nodes: List[Node]
//  def edges: List[Edge]
//  def addNode: Node
//}
//
////abstract class DirectedGraph extends Graph {
////  type Edge <: EdgeImpl
////
////  class EdgeImpl(origin: Node, dest: Node) {
////    def from = origin
////    def to = dest
////  }
////  class NodeImpl extends NodeIntf {
////    def connectedWith(node:Node): Edge = {
////      val edge = newEdge(this, node)
////      edges = edge :: edges
////      edge
////    }
////  }
////  protected def newNode: Node
////  protected def newEdge(from: Node, to: Node): Edge
////  var nodes: List[Node] = Nil
////  val edges: List[Edge] = Nil
////  var addNode: Node = {
////    val node = newNode
////    nodes = node :: nodes
////    node
////  }
////
////}
//
//abstract class DirectedGraph extends Graph {
//  type Edge <: EdgeImpl
//  class EdgeImpl(origin: Node, dest: Node) {
//    def from = origin
//    def to = dest
//  }
//  class NodeImpl extends NodeIntf {
//    def connectWith(node: Node): Edge = {
////      val edge = newEdge(this, node)
////      edges = edge :: edges
////      edge
//    }
//  }
//  protected def newNode: Node
//  protected def newEdge(from: Node, to: Node): Edge
//  var nodes: List[Node] = Nil
//  var edges: List[Edge] = Nil
//  def addNode: Node = {
//    val node = newNode
//    nodes = node :: nodes
//    node
//  }
//}