SUMMARY = "Monitoring user activity"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras libxscrnsaver", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "cdd6a8e6c8d1ccc02a18125896ff3785"
SRC_URI[sha256sum] = "55ee8191a7d5dade374c0387bd84f2c6a14e99aae6763aa734fbfdd86e041ff4"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
