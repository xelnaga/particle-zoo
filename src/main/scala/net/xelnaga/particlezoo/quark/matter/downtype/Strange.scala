package net.xelnaga.particlezoo.quark.matter.downtype

import net.xelnaga.particlezoo.attribute.Generation.Second
import net.xelnaga.particlezoo.attribute.MatterColorCharge

case class Strange(colorCharge: MatterColorCharge) extends DownTypeQuark {

  override val generation = Second

  override val symbol = "s"
}