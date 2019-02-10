SUMMARY = "Monitoring user activity"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras libxscrnsaver", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b1be65f6c85633f98e13555fdf185ec7"
SRC_URI[sha256sum] = "2f34d71383ed038318a21dddab7de71a8d67f80df430dba174ee43c90cfc06cf"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
