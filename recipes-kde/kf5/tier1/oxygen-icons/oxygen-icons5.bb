SUMMARY = "KDE oxygen icons"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=6e01bfa20e899e8ad569d5488923cbd2 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[md5sum] = "dc1ae66764ee48813e1a8bc270f5bda9"
SRC_URI[sha256sum] = "16cafdb5a91465e1c711f55305a41df0ccb6f7b78582243fbdf45752d1f0d3de"

PV = "${KF5_VERSION}"

FILES_${PN} += " \
    ${datadir}/icons/oxygen \
"

RPROVIDES_${PN} += "oxygen-icons"
RREPLACES_${PN} += "oxygen-icons"
RCONFLICTS_${PN} += "oxygen-icons"
