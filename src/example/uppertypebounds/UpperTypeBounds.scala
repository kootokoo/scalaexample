package example.uppertypebounds

/**
  * Created by koo on 2017. 2. 12..
  */
object UpperTypeBounds extends App{
  var dogCate = new Cate[Dog](new Dog)
}

abstract class Animal {
  def name: String
}

abstract class Pet extends Animal {}

class Cat extends Pet {
  override def name: String = "Cat"
}

class Dog extends Pet {
  override def name: String = "Dog"
}

class Lion extends Animal {
  override def name:String = "Lion"
}

class Cate [P <: Pet] (p:P) {
  def pet: P = p
}



