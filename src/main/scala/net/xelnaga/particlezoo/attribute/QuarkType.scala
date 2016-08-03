package net.xelnaga.particlezoo.attribute

sealed trait QuarkType

object QuarkType {

  case object UpType extends QuarkType
  case object DownType extends QuarkType
}