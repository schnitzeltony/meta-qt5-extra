SUMMARY = "Monitoring user activity"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras libxscrnsaver", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e0e37a5a5a3fdfe805d0acb151e3459c"
SRC_URI[sha256sum] = "252965db39e1c9f927896176b8b9683c9d7ca25cd1373a3924036f87e2222824"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
