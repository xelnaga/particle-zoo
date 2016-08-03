package net.xelnaga.particlezoo.elementary.quark.antimatter.uptype

import net.xelnaga.particlezoo.attribute.ElectricCharge
import net.xelnaga.particlezoo.attribute.ElectricCharge.NegativeOneThird
import net.xelnaga.particlezoo.attribute.QuarkType.UpType
import net.xelnaga.particlezoo.elementary.quark.antimatter.AntimatterQuark

trait UpTypeAntiquark extends AntimatterQuark {

  override val electricCharge: ElectricCharge = NegativeOneThird

  override val quarkType = UpType
}
