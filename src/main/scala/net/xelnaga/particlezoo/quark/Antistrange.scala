package net.xelnaga.particlezoo.quark

import net.xelnaga.particlezoo.attribute.ColorCharge
import net.xelnaga.particlezoo.attribute.Generation.Second
import net.xelnaga.particlezoo.attribute.MatterType.{Antimatter, Matter}
import net.xelnaga.particlezoo.attribute.QuarkType.DownType

case class Antistrange(colorCharge: ColorCharge) extends Quark {

  override val generation = Second

  override val matterType = Antimatter

  override val quarkType = DownType

  override val symbol = "s̅"
}