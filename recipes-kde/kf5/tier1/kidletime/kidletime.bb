SUMMARY = "Monitoring user activity"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras libxscrnsaver", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "54233e5d48c7d625f084e2754d77ae57"
SRC_URI[sha256sum] = "10b12437efb42c66956a728dad3a04d84dab5a081536a3b7029393a0ae3f1722"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
