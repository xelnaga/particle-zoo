package net.xelnaga.particlezoo.elementary.quark.matter.downtype

import net.xelnaga.particlezoo.attribute.Generation.First
import net.xelnaga.particlezoo.attribute.MatterColorCharge

case class Down(colorCharge: MatterColorCharge) extends DownTypeQuark {

  override val generation = First

  override val symbol = "d"
}