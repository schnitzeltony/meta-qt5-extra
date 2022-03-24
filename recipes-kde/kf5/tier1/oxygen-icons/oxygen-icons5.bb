SUMMARY = "KDE oxygen icons"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=6e01bfa20e899e8ad569d5488923cbd2 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[sha256sum] = "ca88b03fdd961f9f8bfa449e1fe74e3ce66e11937be9a8f6d1569a46f6429ef1"
PV = "${KF5_VERSION}"

FILES:${PN} += " \
    ${datadir}/icons/oxygen \
"

RPROVIDES:${PN} += "oxygen-icons"
RREPLACES:${PN} += "oxygen-icons"
RCONFLICTS:${PN} += "oxygen-icons"
