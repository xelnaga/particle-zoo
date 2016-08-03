package net.xelnaga.particlezoo.elementary.quark.matter.uptype

import net.xelnaga.particlezoo.attribute.ElectricCharge
import net.xelnaga.particlezoo.attribute.ElectricCharge.TwoThirds
import net.xelnaga.particlezoo.attribute.QuarkType.UpType
import net.xelnaga.particlezoo.elementary.quark.matter.MatterQuark

trait UpTypeQuark extends MatterQuark {

  override val electricCharge: ElectricCharge = TwoThirds

  override val quarkType = UpType
}
