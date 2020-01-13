SUMMARY = "Monitoring user activity"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras libxscrnsaver", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6a92fe7ec92907a6df27ccedc90bf6ba"
SRC_URI[sha256sum] = "66e891b33ed9026ed6fd211cd1ecf3405255b19d3a58199b87af0b22a40d7185"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
