SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "e39bda4d2807c83063b980008e8d9f14add71bc5fa1ddbc059754ea416bbe70f"

FILES_${PN} += "${datadir}/wallpapers"
