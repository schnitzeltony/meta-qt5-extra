SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[md5sum] = "5b0cbd57e9d2ff7261a5b88fa37f9401"
SRC_URI[sha256sum] = "445b5cb8774cb224f804abea7864a8bf6307b6a4d1958b4caf1d251f02f98204"

PV = "${KF5_VERSION}"

FILES_${PN} += "${datadir}/icons"
