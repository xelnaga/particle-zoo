package net.xelnaga.particlezoo.attribute

sealed trait ColorCharge

object ColorCharge {

  case object Red extends ColorCharge
  case object Green extends ColorCharge
  case object Blue extends ColorCharge
}
