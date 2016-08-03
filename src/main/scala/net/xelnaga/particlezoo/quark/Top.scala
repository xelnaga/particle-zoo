package net.xelnaga.particlezoo.quark

import net.xelnaga.particlezoo.attribute.ColorCharge
import net.xelnaga.particlezoo.attribute.Generation.Third
import net.xelnaga.particlezoo.attribute.MatterType.Matter
import net.xelnaga.particlezoo.attribute.QuarkType.UpType

case class Top(colorCharge: ColorCharge) extends Quark {

  override val generation = Third

  override val matterType = Matter

  override val quarkType = UpType

  override val symbol = "t"
}