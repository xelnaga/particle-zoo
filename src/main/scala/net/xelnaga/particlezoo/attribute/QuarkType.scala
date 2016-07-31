package net.xelnaga.particlezoo.attribute

import net.xelnaga.particlezoo.attribute.ElectricCharge.{NegativeOneThird, TwoThirds}
import net.xelnaga.particlezoo.attribute.QuarkType.{DownType, UpType}

sealed trait QuarkType

object QuarkType {

  case object UpType extends QuarkType
  case object DownType extends QuarkType
}

trait UpTypeQuark {

  val electricCharge = TwoThirds

  val quarkType = UpType
}

trait DownTypeQuark {

  val electricCharge = NegativeOneThird

  val quarkType = DownType
}