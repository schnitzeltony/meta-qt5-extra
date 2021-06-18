SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "d752ceeb64bc67e1dfdc0dd2a21dae6a9a3b0c7da2023a5c6148d98a544e282e"

FILES_${PN} += "${datadir}/wallpapers"
