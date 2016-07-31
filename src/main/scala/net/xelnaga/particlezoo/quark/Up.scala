package net.xelnaga.particlezoo.quark

import net.xelnaga.particlezoo.attribute.{ColorCharge, FirstGeneration, UpTypeQuark}

case class Up(colorCharge: ColorCharge) extends Quark
  with UpTypeQuark
  with FirstGeneration {

  val symbol = "u"
}