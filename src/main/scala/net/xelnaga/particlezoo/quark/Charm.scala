package net.xelnaga.particlezoo.quark

import net.xelnaga.particlezoo.attribute.ColorCharge
import net.xelnaga.particlezoo.attribute.Generation.Second
import net.xelnaga.particlezoo.attribute.MatterType.Matter
import net.xelnaga.particlezoo.attribute.QuarkType.UpType

case class Charm(colorCharge: ColorCharge) extends Quark {

  override val generation = Second

  override val matterType = Matter

  override val quarkType = UpType

  override val symbol = "c"
}