package net.xelnaga.particlezoo.quark

import net.xelnaga.particlezoo.attribute.ColorCharge
import net.xelnaga.particlezoo.attribute.Generation.Third
import net.xelnaga.particlezoo.attribute.MatterType.Matter
import net.xelnaga.particlezoo.attribute.QuarkType.DownType

case class Bottom(colorCharge: ColorCharge) extends Quark {

  override val generation = Third

  override val matterType = Matter

  override val quarkType = DownType

  override val symbol = "b"
}
