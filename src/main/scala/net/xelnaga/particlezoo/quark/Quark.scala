package net.xelnaga.particlezoo.quark

import net.xelnaga.particlezoo.attribute.Spin.Half
import net.xelnaga.particlezoo.attribute._

trait Quark { self =>

  val colorCharge: ColorCharge

  val electricCharge: ElectricCharge

  val generation: Generation

  val name: String = self.getClass.getSimpleName.replace("$", "")

  val quarkType: QuarkType

  val spin: Spin = Half

  val symbol: String
}
