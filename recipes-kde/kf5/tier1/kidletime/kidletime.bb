SUMMARY = "Monitoring user activity"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras libxscrnsaver", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "76bab90a226c1e437ce1ed135379b123"
SRC_URI[sha256sum] = "196cb99c7f30ea571f9a7e8c0b507ef95aa54731457f4bc9e4380ff1350da57d"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
