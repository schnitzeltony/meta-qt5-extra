SUMMARY = "KDE oxygen icons"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=6e01bfa20e899e8ad569d5488923cbd2 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[md5sum] = "4d2016bc53b675a776b7321e49132dee"
SRC_URI[sha256sum] = "0e6a6fd611893c870901b78f601caf8ae9afd2a666088a5a167f3cbf815bd3e7"

PV = "${KF5_VERSION}"

FILES_${PN} += " \
    ${datadir}/icons/oxygen \
"

RPROVIDES_${PN} += "oxygen-icons"
RREPLACES_${PN} += "oxygen-icons"
RCONFLICTS_${PN} += "oxygen-icons"
