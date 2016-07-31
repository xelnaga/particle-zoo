package net.xelnaga.particlezoo.quark

import net.xelnaga.particlezoo.attribute.ColorCharge.Red
import net.xelnaga.particlezoo.attribute.ElectricCharge.{NegativeOneThird, TwoThirds}
import net.xelnaga.particlezoo.attribute.Generation.{First, Second, Third}
import net.xelnaga.particlezoo.attribute.Interaction.{Electromagnetic, Gravity, Strong, Weak}
import net.xelnaga.particlezoo.attribute.QuarkType.{DownType, UpType}
import net.xelnaga.particlezoo.attribute.Spin.Half
import net.xelnaga.particlezoo.attribute.UpTypeQuark
import org.scalatest.{FunSuite, Matchers}

class QuarkSpec extends FunSuite with Matchers {

  val up = Up(Red)
  val down = Down(Red)
  val charm = Charm(Red)
  val strange = Strange(Red)
  val top = Top(Red)
  val bottom = Bottom(Red)

  val quarks = Vector(
    up,
    down,
    charm,
    strange,
    top,
    bottom
  )

  val upType = Vector(up, charm, top)
  val downType = Vector(down, strange, bottom)

  val firstGeneration = Vector(up, down)
  val secondGeneration = Vector(charm, strange)
  val thirdGeneration = Vector(top, bottom)

  val symbols = Map(
    up -> "u",
    down -> "d",
    charm -> "c",
    strange -> "s",
    top -> "t",
    bottom -> "b"
  )

  upType.foreach { quark =>
    test(s"all up type quarks have electric charge of 2/3e: ${quark.name}") {
      quark.electricCharge shouldBe TwoThirds
    }
  }

  downType.foreach { quark =>
    test(s"all down type quarks have electric charge of -1/3e: ${quark.name}") {
      quark.electricCharge shouldBe NegativeOneThird
    }
  }

  firstGeneration.foreach { quark =>
    test(s"all first generation quarks have generation first: ${quark.name}") {
      quark.generation shouldBe First
    }
  }

  secondGeneration.foreach { quark =>
    test(s"all second generation quarks have generation second: ${quark.name}") {
      quark.generation shouldBe Second
    }
  }

  thirdGeneration.foreach { quark =>
    test(s"all third generation quarks have generation third: ${quark.name}") {
      quark.generation shouldBe Third
    }
  }

  upType.foreach { quark =>
    test(s"all up type quarks have type of up type: ${quark.name}") {
      quark.quarkType shouldBe UpType
    }
  }

  downType.foreach { quark =>
    test(s"all down type quarks have type of down type: ${quark.name}") {
      quark.quarkType shouldBe DownType
    }
  }

  quarks.foreach { quark =>
    test(s"all quarks have spin half: ${quark.name}") {
      quark.spin shouldBe Half
    }
  }

  symbols.foreach { case (quark, symbol) =>
    test(s"all quarks have a symbol: ${quark.name}, $symbol") {
      quark.symbol shouldBe symbol
    }
  }

  quarks.foreach { quark =>
    test(s"all quarks experience all four fundamental interactions: ${quark.name}") {
      quark.interactions shouldBe Vector(Gravity, Electromagnetic, Strong, Weak)
    }
  }
}
