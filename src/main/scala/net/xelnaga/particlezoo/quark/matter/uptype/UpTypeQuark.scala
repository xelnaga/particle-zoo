package net.xelnaga.particlezoo.quark.matter.uptype

import net.xelnaga.particlezoo.attribute.ElectricCharge
import net.xelnaga.particlezoo.attribute.ElectricCharge.TwoThirds
import net.xelnaga.particlezoo.attribute.QuarkType.UpType
import net.xelnaga.particlezoo.quark.matter.MatterQuark

trait UpTypeQuark extends MatterQuark {

  override val electricCharge: ElectricCharge = TwoThirds

  override val quarkType = UpType
}
