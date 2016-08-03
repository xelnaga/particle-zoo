package net.xelnaga.particlezoo.quark.antimatter.downtype

import net.xelnaga.particlezoo.attribute.AntimatterColorCharge
import net.xelnaga.particlezoo.attribute.Generation.Third

case class Antibottom(colorCharge: AntimatterColorCharge) extends DownTypeAntiquark {

  override val generation = Third

  override val symbol = "b̅"
}
