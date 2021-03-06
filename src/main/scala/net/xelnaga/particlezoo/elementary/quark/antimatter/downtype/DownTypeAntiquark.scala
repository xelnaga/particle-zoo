package net.xelnaga.particlezoo.elementary.quark.antimatter.downtype

import net.xelnaga.particlezoo.attribute.ElectricCharge
import net.xelnaga.particlezoo.attribute.ElectricCharge.TwoThirds
import net.xelnaga.particlezoo.attribute.QuarkType.DownType
import net.xelnaga.particlezoo.elementary.quark.antimatter.AntimatterQuark

trait DownTypeAntiquark extends AntimatterQuark {

  override val electricCharge: ElectricCharge = TwoThirds

  override val quarkType = DownType
}
