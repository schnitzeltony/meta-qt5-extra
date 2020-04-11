SUMMARY = "KDE oxygen icons"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=6e01bfa20e899e8ad569d5488923cbd2 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[md5sum] = "1ae62e5a1abc741d4e0fa815928fc151"
SRC_URI[sha256sum] = "5e3e15e7e2a9579d61425e3cd465740a7d54e14c488983f8f441ba5a0abf27ee"

PV = "${KF5_VERSION}"

FILES_${PN} += " \
    ${datadir}/icons/oxygen \
"

RPROVIDES_${PN} += "oxygen-icons"
RREPLACES_${PN} += "oxygen-icons"
RCONFLICTS_${PN} += "oxygen-icons"
