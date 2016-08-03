package net.xelnaga.particlezoo.attribute

sealed trait MatterType

object MatterType {

  case object Matter extends MatterType
  case object Antimatter extends MatterType
}