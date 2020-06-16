SUMMARY = "Monitoring user activity"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras libxscrnsaver", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ce684efb0eecda9d47115b0d25c6af4d"
SRC_URI[sha256sum] = "1bcacd6c9ec8d65f93434f51d865723a50609ec074f88da2890a8f37ea8d207d"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
