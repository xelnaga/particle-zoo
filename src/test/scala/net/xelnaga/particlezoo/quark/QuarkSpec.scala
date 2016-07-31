package net.xelnaga.particlezoo.quark

import net.xelnaga.particlezoo.attribute.ColorCharge.Red
import net.xelnaga.particlezoo.attribute.ElectricCharge.{NegativeOneThird, TwoThirds}
import net.xelnaga.particlezoo.attribute.Generation.{First, Second, Third}
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
    test(s"up type quarks should have electric charge: ${quark.name}, 2/3") {
      quark.electricCharge shouldBe TwoThirds
    }
  }

  downType.foreach { quark =>
    test(s"down type quarks should have electric charge: ${quark.name}, -1/3") {
      quark.electricCharge shouldBe NegativeOneThird
    }
  }

  firstGeneration.foreach { quark =>
    test(s"quarks should have generation: ${quark.name}, First") {
      quark.generation shouldBe First
    }
  }

  secondGeneration.foreach { quark =>
    test(s"quarks should have generation: ${quark.name}, Second") {
      quark.generation shouldBe Second
    }
  }

  thirdGeneration.foreach { quark =>
    test(s"quarks should have generation: ${quark.name}, Third") {
      quark.generation shouldBe Third
    }
  }

  upType.foreach { quark =>
    test(s"quarks should have type: ${quark.name}, UpType") {
      quark.quarkType shouldBe UpType
    }
  }

  downType.foreach { quark =>
    test(s"quarks should have type: ${quark.name}, DownType") {
      quark.quarkType shouldBe DownType
    }
  }

  quarks.foreach { quark =>
    test(s"quarks should have spin: ${quark.name}, Half") {
      quark.spin shouldBe Half
    }
  }

  symbols.foreach { case (quark, symbol) =>
    test(s"quarks should have symbol: ${quark.name}, $symbol") {
      quark.symbol shouldBe symbol
    }
  }
}
