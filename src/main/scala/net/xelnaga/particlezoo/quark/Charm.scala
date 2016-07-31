package net.xelnaga.particlezoo.quark

import net.xelnaga.particlezoo.attribute.{ColorCharge, SecondGeneration, UpTypeQuark}

case class Charm(colorCharge: ColorCharge) extends Quark
  with UpTypeQuark
  with SecondGeneration {

  val symbol = "c"
}