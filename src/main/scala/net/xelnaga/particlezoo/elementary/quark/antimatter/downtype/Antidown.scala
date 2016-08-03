package net.xelnaga.particlezoo.elementary.quark.antimatter.downtype

import net.xelnaga.particlezoo.attribute.AntimatterColorCharge
import net.xelnaga.particlezoo.attribute.Generation.First

case class Antidown(colorCharge: AntimatterColorCharge) extends DownTypeAntiquark {

  override val generation = First

  override val symbol = "d̅"
}