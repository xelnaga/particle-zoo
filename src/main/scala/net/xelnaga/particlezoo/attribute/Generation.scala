package net.xelnaga.particlezoo.attribute

import net.xelnaga.particlezoo.attribute.Generation.{First, Second, Third}

sealed trait Generation

object Generation {

  case object First extends Generation
  case object Second extends Generation
  case object Third extends Generation
}

trait FirstGeneration {

  val generation = First
}

trait SecondGeneration {

  val generation = Second
}

trait ThirdGeneration {

  val generation = Third
}
