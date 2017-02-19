package example.compoundtpyes

/**
  * Created by koo on 2017. 2. 19..
  */
object CompoundTypes {

}

trait Cloneable extends java.lang.Cloneable {
  override def clone(): Cloneable = {
    super.clone().asInstanceOf[Cloneable]
  }
}
trait Resetable {
  def reset: Unit
}

def cloneAndReset(obj: Cloneable with Resetable): Cloneable = {

}