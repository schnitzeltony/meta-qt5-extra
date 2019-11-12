SUMMARY = "Monitoring user activity"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras libxscrnsaver", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7e47e4020a5bd7728d81f24b9eaaa2a9"
SRC_URI[sha256sum] = "8287e958a8a2a9538bec1038f5e31ebba338ff522de9c51265ca1d63030581d0"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
