package net.xelnaga.particlezoo.elementary.quark.matter.uptype

import net.xelnaga.particlezoo.attribute.Generation.Third
import net.xelnaga.particlezoo.attribute.MatterColorCharge

case class Top(colorCharge: MatterColorCharge) extends UpTypeQuark {

  override val generation = Third

  override val symbol = "t"
}