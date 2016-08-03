package net.xelnaga.particlezoo.quark

import net.xelnaga.particlezoo.attribute.ElectricCharge.{NegativeOneThird, TwoThirds}
import net.xelnaga.particlezoo.attribute.Interaction.{Electromagnetic, Gravity, Strong, Weak}
import net.xelnaga.particlezoo.attribute.QuarkType.{DownType, UpType}
import net.xelnaga.particlezoo.attribute.Spin.Half
import net.xelnaga.particlezoo.attribute._

trait Quark { self =>

  val colorCharge: ColorCharge

  lazy val electricCharge: ElectricCharge = {

    quarkType match {
      case UpType => TwoThirds
      case DownType => NegativeOneThird
    }
  }

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
