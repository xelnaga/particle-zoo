package net.xelnaga.particlezoo.quark.matter

import net.xelnaga.particlezoo.attribute.MatterType.Matter
import net.xelnaga.particlezoo.attribute.{MatterColorCharge, MatterType}
import net.xelnaga.particlezoo.quark.Quark

trait MatterQuark extends Quark {

  val colorCharge: MatterColorCharge

  val matterType: MatterType = Matter
}
