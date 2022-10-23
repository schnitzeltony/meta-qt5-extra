SUMMARY = "KDE oxygen icons"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=6e01bfa20e899e8ad569d5488923cbd2 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[sha256sum] = "8ce6ab8a0158f6e3673961fe6a37830af11d776f722f968d66dc257d5b0253dd"
PV = "${KF5_VERSION}"

FILES:${PN} += " \
    ${datadir}/icons/oxygen \
"

RPROVIDES:${PN} += "oxygen-icons"
RREPLACES:${PN} += "oxygen-icons"
RCONFLICTS:${PN} += "oxygen-icons"
