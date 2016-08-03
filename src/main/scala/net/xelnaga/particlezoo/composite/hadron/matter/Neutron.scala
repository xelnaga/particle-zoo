package net.xelnaga.particlezoo.composite.hadron.matter

import net.xelnaga.particlezoo.elementary.quark.matter.downtype.DownTypeQuark
import net.xelnaga.particlezoo.elementary.quark.matter.uptype.UpTypeQuark

case class Neutron(up: UpTypeQuark, down1: DownTypeQuark, down2: DownTypeQuark) extends Baryon(up, down1, down2)
