package net.xelnaga.particlezoo.elementary.quark.antimatter.uptype

import net.xelnaga.particlezoo.attribute.AntimatterColorCharge
import net.xelnaga.particlezoo.attribute.Generation.First

case class Antiup(colorCharge: AntimatterColorCharge) extends UpTypeAntiquark {

  override val generation = First

  override val symbol = "u̅"
}