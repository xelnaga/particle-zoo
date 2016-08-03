package net.xelnaga.particlezoo.quark.matter.uptype

import net.xelnaga.particlezoo.attribute.Generation.First
import net.xelnaga.particlezoo.attribute.MatterColorCharge

case class Up(colorCharge: MatterColorCharge) extends UpTypeQuark {

  override val generation = First

  override val symbol = "u"
}