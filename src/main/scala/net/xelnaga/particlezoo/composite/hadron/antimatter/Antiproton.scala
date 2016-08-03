package net.xelnaga.particlezoo.composite.hadron.antimatter

import net.xelnaga.particlezoo.elementary.quark.antimatter.downtype.DownTypeAntiquark
import net.xelnaga.particlezoo.elementary.quark.antimatter.uptype.UpTypeAntiquark

case class Antiproton(up1: UpTypeAntiquark, up2: UpTypeAntiquark, down: DownTypeAntiquark) extends Antibaryon(up1, up2, down)
