package net.xelnaga.particlezoo.quark

import net.xelnaga.particlezoo.attribute.{ColorCharge, ThirdGeneration, UpTypeQuark}

case class Top(colorCharge: ColorCharge) extends Quark
  with UpTypeQuark
  with ThirdGeneration {

  val symbol = "t"
}