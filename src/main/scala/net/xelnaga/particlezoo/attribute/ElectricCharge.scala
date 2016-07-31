package net.xelnaga.particlezoo.attribute

sealed trait ElectricCharge

object ElectricCharge {

  case object NegativeOneThird extends ElectricCharge
  case object TwoThirds extends ElectricCharge
}
