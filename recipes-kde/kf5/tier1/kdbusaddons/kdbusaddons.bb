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
SRC_URI[md5sum] = "7004f54b9c0d04151dad4ee5b3a0b510"
SRC_URI[sha256sum] = "5c8ee0f8e5741d6a934aa722874ba3d7f0d101f43bddc4e87c15320f289fa232"
