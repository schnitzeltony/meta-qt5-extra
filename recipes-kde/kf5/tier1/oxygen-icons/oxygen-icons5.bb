SUMMARY = "KDE oxygen icons"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=6e01bfa20e899e8ad569d5488923cbd2 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[sha256sum] = "3caf812346adc7c5b91769fc77a6b4e91ccf764c755b84146a88f2fc46be538e"
PV = "${KF5_VERSION}"

FILES_${PN} += " \
    ${datadir}/icons/oxygen \
"

RPROVIDES_${PN} += "oxygen-icons"
RREPLACES_${PN} += "oxygen-icons"
RCONFLICTS_${PN} += "oxygen-icons"
