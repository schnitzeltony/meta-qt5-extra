SUMMARY = "KDE oxygen icons"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=6e01bfa20e899e8ad569d5488923cbd2 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[sha256sum] = "f966276ad223f330ceb765a99d07b5482710353b5b272faea240390ccb14bdbe"
PV = "${KF5_VERSION}"

FILES:${PN} += " \
    ${datadir}/icons/oxygen \
"

RPROVIDES:${PN} += "oxygen-icons"
RREPLACES:${PN} += "oxygen-icons"
RCONFLICTS:${PN} += "oxygen-icons"
