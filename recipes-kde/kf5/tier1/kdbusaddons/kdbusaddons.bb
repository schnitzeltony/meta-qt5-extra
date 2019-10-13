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
SRC_URI[md5sum] = "7facaffdc5ddeff0ba7b177ed5ece8df"
SRC_URI[sha256sum] = "1b0ba356dd285b6785d14b91f17eb1bcb9c5c84f23ff5c8608954cb013cafc87"
