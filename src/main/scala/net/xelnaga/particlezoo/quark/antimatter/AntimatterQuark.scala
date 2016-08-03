package net.xelnaga.particlezoo.quark.antimatter

import net.xelnaga.particlezoo.attribute.{AntimatterColorCharge, MatterType}
import net.xelnaga.particlezoo.quark.Quark

trait AntimatterQuark extends Quark {

  val colorCharge: AntimatterColorCharge

  val matterType: MatterType = MatterType.Antimatter
}
