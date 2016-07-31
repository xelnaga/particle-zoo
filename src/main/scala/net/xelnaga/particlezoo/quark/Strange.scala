package net.xelnaga.particlezoo.quark

import net.xelnaga.particlezoo.attribute.{ColorCharge, DownTypeQuark, SecondGeneration}

case class Strange(colorCharge: ColorCharge) extends Quark
  with DownTypeQuark
  with SecondGeneration {

  val symbol = "s"
}