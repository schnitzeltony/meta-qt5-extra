SUMMARY = "KDE oxygen icons"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=6e01bfa20e899e8ad569d5488923cbd2 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[sha256sum] = "b7e36ea83cf840dbbc7a0a9fe0528b64d96c764e0485ed5d6e0c5cbb3072f12f"
PV = "${KF5_VERSION}"

FILES:${PN} += " \
    ${datadir}/icons/oxygen \
"

RPROVIDES:${PN} += "oxygen-icons"
RREPLACES:${PN} += "oxygen-icons"
RCONFLICTS:${PN} += "oxygen-icons"
