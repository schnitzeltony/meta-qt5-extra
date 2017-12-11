SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[md5sum] = "4d9130ec475e1a99d44cddc3be5c0965"
SRC_URI[sha256sum] = "9cdce42833ebdf1f1ecfca966fc1f132a0a2ab5eaaf10433b5dc5a8688ae06cc"

PV = "${KF5_VERSION}"

DEPENDS += " \
    kiconthemes \
"

FILES_${PN} += "${datadir}/icons"
