package net.xelnaga.particlezoo.elementary.quark

import net.xelnaga.particlezoo.attribute.Interaction.{Electromagnetic, Gravity, Strong, Weak}
import net.xelnaga.particlezoo.attribute.Spin.Half
import net.xelnaga.particlezoo.attribute._

trait Quark { self =>

  val colorCharge: ColorCharge

  val electricCharge: ElectricCharge

  val generation: Generation

  val interactions = Vector[Interaction](
    Gravity,
    Electromagnetic,
    Strong,
    Weak
  )

  val matterType: MatterType

  val name: String = self.getClass.getSimpleName.replace("$", "")

  val quarkType: QuarkType

  val spin: Spin = Half

  val symbol: String

}
