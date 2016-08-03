package net.xelnaga.particlezoo.quark

import net.xelnaga.particlezoo.attribute.ColorCharge
import net.xelnaga.particlezoo.attribute.Generation.First
import net.xelnaga.particlezoo.attribute.MatterType.{Antimatter, Matter}
import net.xelnaga.particlezoo.attribute.QuarkType.DownType

case class Antidown(colorCharge: ColorCharge) extends Quark {

  override val generation = First

  override val matterType = Antimatter

  override val quarkType = DownType

  override val symbol = "d̅"
}