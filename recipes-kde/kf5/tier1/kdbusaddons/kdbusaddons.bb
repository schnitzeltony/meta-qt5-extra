SUMMARY = "Addons to QtDBus"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += " \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5d67200c6d00b7abbba5608e38eb3adc"
SRC_URI[sha256sum] = "c3ba307d651a2ac6842319cbab0a8686d0bb13eaba0f3faf7ee386460db0031e"
