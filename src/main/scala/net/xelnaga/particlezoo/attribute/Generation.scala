package net.xelnaga.particlezoo.attribute

sealed trait Generation

object Generation {

  case object First extends Generation
  case object Second extends Generation
  case object Third extends Generation
}
