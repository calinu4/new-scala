package Garage

/**
  * Created by Profile on 12/06/2017.
  */
class Car(id1:Int,mod:String,tyr:Int,reg:String) extends Vehicle{
  def id:Int=id1
  def model: String = mod
  def tyres:Int=tyr
  def registration:String=reg

  override def toString: String = "Car => "+super.toString

}
