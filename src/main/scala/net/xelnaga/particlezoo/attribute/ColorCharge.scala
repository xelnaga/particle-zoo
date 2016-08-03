package net.xelnaga.particlezoo.attribute

sealed trait ColorCharge

sealed trait MatterColorCharge extends ColorCharge
sealed trait AntimatterColorCharge extends ColorCharge

object ColorCharge {

  case object Red extends MatterColorCharge
  case object Green extends MatterColorCharge
  case object Blue extends MatterColorCharge

  case object Antired extends AntimatterColorCharge
  case object Antigreen extends AntimatterColorCharge
  case object Antiblue extends AntimatterColorCharge
}
