package net.xelnaga.particlezoo.elementary.quark.antimatter.uptype

import net.xelnaga.particlezoo.attribute.AntimatterColorCharge
import net.xelnaga.particlezoo.attribute.Generation.Second

case class Anticharm(colorCharge: AntimatterColorCharge) extends UpTypeAntiquark {

  override val generation = Second

  override val symbol = "c̅"
}