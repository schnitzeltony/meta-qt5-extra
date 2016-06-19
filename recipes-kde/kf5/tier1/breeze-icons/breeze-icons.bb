SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[md5sum] = "ec81600d6dd3059b694827a988cfce95"
SRC_URI[sha256sum] = "e279cbba0d7556dad096db800a6a2b7d0e0e419c06df8f2bf2966f7bf49c98b2"

PV = "${KF5_VERSION}"

FILES_${PN} += "${datadir}/icons"
