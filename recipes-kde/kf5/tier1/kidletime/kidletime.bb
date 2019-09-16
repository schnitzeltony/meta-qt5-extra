SUMMARY = "Monitoring user activity"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras libxscrnsaver", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "837933131a44ec09a92968f082ab0583"
SRC_URI[sha256sum] = "dd2b6a9f7815c8e84b635e694cbf9ee207996d2cf3adb5a85eadd4a8de37f276"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
