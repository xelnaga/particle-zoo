package net.xelnaga.particlezoo.elementary.quark.matter.downtype

import net.xelnaga.particlezoo.attribute.Generation.Third
import net.xelnaga.particlezoo.attribute.MatterColorCharge

case class Bottom(colorCharge: MatterColorCharge) extends DownTypeQuark {

  override val generation = Third

  override val symbol = "b"
}
