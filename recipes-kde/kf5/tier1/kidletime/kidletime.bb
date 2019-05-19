SUMMARY = "Monitoring user activity"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras libxscrnsaver", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f9189c3ba90584800c51686167a310d5"
SRC_URI[sha256sum] = "86d8c4ff13b864c07f98d0475683838708c43e4ba6275e05f21766e2a79cfd90"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
