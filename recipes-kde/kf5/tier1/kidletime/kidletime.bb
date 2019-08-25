SUMMARY = "Monitoring user activity"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras libxscrnsaver", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "53e175bb8168badcf7621f8fc118dd5e"
SRC_URI[sha256sum] = "8fb302dcc5b891ac2f06b5278bd6e08043772f3325bc209175c945280621fca2"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
