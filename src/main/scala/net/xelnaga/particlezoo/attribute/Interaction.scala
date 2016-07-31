package net.xelnaga.particlezoo.attribute

sealed trait Interaction

object Interaction {

  case object Gravity extends Interaction
  case object Electromagnetic extends Interaction
  case object Strong extends Interaction
  case object Weak extends Interaction
}
