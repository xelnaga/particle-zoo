package net.xelnaga.particlezoo.elementary.quark.antimatter.downtype

import net.xelnaga.particlezoo.attribute.AntimatterColorCharge
import net.xelnaga.particlezoo.attribute.Generation.Second

case class Antistrange(colorCharge: AntimatterColorCharge) extends DownTypeAntiquark {

  override val generation = Second

  override val symbol = "s̅"
}