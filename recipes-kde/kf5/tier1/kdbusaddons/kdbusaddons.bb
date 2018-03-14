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
SRC_URI[md5sum] = "9049781e1906ed6513ab26c768cc9b6e"
SRC_URI[sha256sum] = "6f7e8ccb12f243fadb881b7b958000081b89ee115b43d5a0d067e7b9a3b76795"
