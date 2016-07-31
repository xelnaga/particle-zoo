package net.xelnaga.particlezoo.quark

import net.xelnaga.particlezoo.attribute.{ColorCharge, DownTypeQuark, ThirdGeneration}

case class Bottom(colorCharge: ColorCharge) extends Quark
  with DownTypeQuark
  with ThirdGeneration {

  val symbol = "b"
}
