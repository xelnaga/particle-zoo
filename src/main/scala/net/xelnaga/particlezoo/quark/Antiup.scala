package net.xelnaga.particlezoo.quark

import net.xelnaga.particlezoo.attribute.ColorCharge
import net.xelnaga.particlezoo.attribute.Generation.First
import net.xelnaga.particlezoo.attribute.MatterType.Antimatter
import net.xelnaga.particlezoo.attribute.QuarkType.UpType

case class Antiup(colorCharge: ColorCharge) extends Quark {

  override val generation = First

  override val matterType = Antimatter

  override val quarkType = UpType

  override val symbol = "u̅"
}