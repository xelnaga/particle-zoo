package net.xelnaga.particlezoo.quark.antimatter.uptype

import net.xelnaga.particlezoo.attribute.AntimatterColorCharge
import net.xelnaga.particlezoo.attribute.Generation.Third

case class Antitop(colorCharge: AntimatterColorCharge) extends UpTypeAntiquark {

  override val generation = Third

  override val symbol = "t̅"
}