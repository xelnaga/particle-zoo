package net.xelnaga.particlezoo.quark.matter.downtype

import net.xelnaga.particlezoo.attribute.ElectricCharge
import net.xelnaga.particlezoo.attribute.ElectricCharge.NegativeOneThird
import net.xelnaga.particlezoo.attribute.QuarkType.DownType
import net.xelnaga.particlezoo.quark.matter.MatterQuark

trait DownTypeQuark extends MatterQuark {

  override val electricCharge: ElectricCharge = NegativeOneThird

  override val quarkType = DownType
}
