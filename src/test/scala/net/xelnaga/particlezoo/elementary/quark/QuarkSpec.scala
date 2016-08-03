package net.xelnaga.particlezoo.elementary.quark

import net.xelnaga.particlezoo.attribute.ColorCharge.{Antired, Red}
import net.xelnaga.particlezoo.attribute.ElectricCharge.{NegativeOneThird, TwoThirds}
import net.xelnaga.particlezoo.attribute.Generation.{First, Second, Third}
import net.xelnaga.particlezoo.attribute.Interaction.{Electromagnetic, Gravity, Strong, Weak}
import net.xelnaga.particlezoo.attribute.MatterType.{Antimatter, Matter}
import net.xelnaga.particlezoo.attribute.QuarkType.{DownType, UpType}
import net.xelnaga.particlezoo.attribute.Spin.Half
import net.xelnaga.particlezoo.elementary.quark.antimatter.downtype.{Antibottom, Antidown, Antistrange}
import net.xelnaga.particlezoo.elementary.quark.antimatter.uptype.{Anticharm, Antitop, Antiup}
import net.xelnaga.particlezoo.elementary.quark.matter.downtype.{Bottom, Down, Strange}
import net.xelnaga.particlezoo.elementary.quark.matter.uptype.{Charm, Top, Up}
import org.scalatest.{FunSuite, Matchers}

class QuarkSpec extends FunSuite with Matchers {

  val up = Up(Red)
  val down = Down(Red)
  val charm = Charm(Red)
  val strange = Strange(Red)
  val top = Top(Red)
  val bottom = Bottom(Red)

  val antiup = Antiup(Antired)
  val antidown = Antidown(Antired)
  val anticharm = Anticharm(Antired)
  val antistrange = Antistrange(Antired)
  val antitop = Antitop(Antired)
  val antibottom = Antibottom(Antired)

  val quarks = Vector(
    up,
    down,
    charm,
    strange,
    top,
    bottom,
    antiup,
    antidown,
    anticharm,
    antistrange,
    antitop,
    antibottom
  )

  val upType = Vector(up, charm, top)
  val downType = Vector(down, strange, bottom)

  val electricCharges = Map(
    up -> TwoThirds,
    down -> NegativeOneThird,
    charm -> TwoThirds,
    strange -> NegativeOneThird,
    top -> TwoThirds,
    bottom -> NegativeOneThird,
    antiup -> NegativeOneThird,
    antidown -> TwoThirds,
    anticharm -> NegativeOneThird,
    antistrange -> TwoThirds,
    antitop -> NegativeOneThird,
    antibottom -> TwoThirds
  )

  val generations = Map(
    up -> First,
    down -> First,
    charm -> Second,
    strange -> Second,
    top -> Third,
    bottom -> Third,
    antiup -> First,
    antidown -> First,
    anticharm -> Second,
    antistrange -> Second,
    antitop -> Third,
    antibottom -> Third
  )

  val matter = Map(
    up -> Matter,
    down -> Matter,
    charm -> Matter,
    strange -> Matter,
    top -> Matter,
    bottom -> Matter,
    antiup -> Antimatter,
    antidown -> Antimatter,
    anticharm -> Antimatter,
    antistrange -> Antimatter,
    antitop -> Antimatter,
    antibottom -> Antimatter
  )

  val quarkType = Map(
    up -> UpType,
    down -> DownType,
    charm -> UpType,
    strange -> DownType,
    top -> UpType,
    bottom -> DownType,
    antiup -> UpType,
    antidown -> DownType,
    anticharm -> UpType,
    antistrange -> DownType,
    antitop -> UpType,
    antibottom -> DownType
  )

  val symbols = Map(
    up -> "u",
    down -> "d",
    charm -> "c",
    strange -> "s",
    top -> "t",
    bottom -> "b",
    antiup -> "u̅",
    antidown -> "d̅",
    anticharm -> "c̅",
    antistrange -> "s̅",
    antitop -> "t̅",
    antibottom -> "b̅"
  )

  quarks.foreach { quark =>
    test(s"all quarks have electric charge: ${quark.name}") {
      quark.electricCharge shouldBe electricCharges(quark)
    }
  }

  quarks.foreach { quark =>
    test(s"all quarks have generation: ${quark.name}") {
      quark.generation shouldBe generations(quark)
    }
  }

  quarks.foreach { quark =>
    test(s"all quarks have matter type: ${quark.name}") {
      quark.matterType shouldBe matter(quark)
    }
  }

  quarks.foreach { quark =>
    test(s"all quarks have quark type: ${quark.name}") {
      quark.quarkType shouldBe quarkType(quark)
    }
  }

  quarks.foreach { quark =>
    test(s"all quarks have spin half: ${quark.name}") {
      quark.spin shouldBe Half
    }
  }

  quarks.foreach { quark =>
    test(s"all quarks have a symbol: ${quark.name}") {
      quark.symbol shouldBe symbols.getOrElse(quark, "")
    }
  }

  quarks.foreach { quark =>
    test(s"all quarks have interactions: ${quark.name}") {
      quark.interactions shouldBe Vector(Gravity, Electromagnetic, Strong, Weak)
    }
  }

  upType.foreach { quark =>
    test(s"all up type matter quarks have electric charge of 2/3e: ${quark.name}") {
      quark.electricCharge shouldBe TwoThirds
    }
  }

  downType.foreach { quark =>
    test(s"all down type quarks have electric charge of -1/3e: ${quark.name}") {
      quark.electricCharge shouldBe NegativeOneThird
    }
  }

}
