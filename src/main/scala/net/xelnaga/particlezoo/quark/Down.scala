package net.xelnaga.particlezoo.quark

import net.xelnaga.particlezoo.attribute.{ColorCharge, DownTypeQuark, FirstGeneration}

case class Down(colorCharge: ColorCharge) extends Quark
  with DownTypeQuark
  with FirstGeneration {

  val symbol = "d"
}