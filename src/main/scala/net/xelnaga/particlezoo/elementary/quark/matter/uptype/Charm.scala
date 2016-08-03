package net.xelnaga.particlezoo.elementary.quark.matter.uptype

import net.xelnaga.particlezoo.attribute.Generation.Second
import net.xelnaga.particlezoo.attribute.MatterColorCharge

case class Charm(colorCharge: MatterColorCharge) extends UpTypeQuark {

  override val generation = Second

  override val symbol = "c"
}