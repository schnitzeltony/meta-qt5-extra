SUMMARY = "Monitoring user activity"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras libxscrnsaver", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2ce235e382fd5835d83ec8bdfd947270"
SRC_URI[sha256sum] = "f1eb9baa29b8b4ab65c5938126e2a9020159d4b535b8ba5700a3602e3005d2df"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
