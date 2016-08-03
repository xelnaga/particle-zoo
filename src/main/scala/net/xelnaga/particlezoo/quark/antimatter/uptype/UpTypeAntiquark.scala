package net.xelnaga.particlezoo.quark.antimatter.uptype

import net.xelnaga.particlezoo.attribute.ElectricCharge
import net.xelnaga.particlezoo.attribute.ElectricCharge.NegativeOneThird
import net.xelnaga.particlezoo.attribute.QuarkType.UpType
import net.xelnaga.particlezoo.quark.antimatter.AntimatterQuark

trait UpTypeAntiquark extends AntimatterQuark {

  override val electricCharge: ElectricCharge = NegativeOneThird

  override val quarkType = UpType
}
