package net.xelnaga.particlezoo.quark

import net.xelnaga.particlezoo.attribute.ColorCharge
import net.xelnaga.particlezoo.attribute.Generation.Third
import net.xelnaga.particlezoo.attribute.MatterType.{Antimatter, Matter}
import net.xelnaga.particlezoo.attribute.QuarkType.UpType

case class Antitop(colorCharge: ColorCharge) extends Quark {

  override val generation = Third

  override val matterType = Antimatter

  override val quarkType = UpType

  override val symbol = "t̅"
}