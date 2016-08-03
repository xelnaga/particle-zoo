package net.xelnaga.particlezoo.elementary.quark.antimatter

import net.xelnaga.particlezoo.attribute.{AntimatterColorCharge, MatterType}
import net.xelnaga.particlezoo.elementary.quark.Quark

trait AntimatterQuark extends Quark {

  val colorCharge: AntimatterColorCharge

  val matterType: MatterType = MatterType.Antimatter
}
