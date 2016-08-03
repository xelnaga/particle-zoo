package net.xelnaga.particlezoo.composite.hadron.antimatter

import net.xelnaga.particlezoo.elementary.quark.antimatter.downtype.DownTypeAntiquark
import net.xelnaga.particlezoo.elementary.quark.antimatter.uptype.UpTypeAntiquark

case class Antineutron(up: UpTypeAntiquark, down1: DownTypeAntiquark, down2: DownTypeAntiquark) extends Antibaryon(up, down1, down2)
