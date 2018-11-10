SUMMARY = "Hardware integration and detection"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bison-native qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "cfb3f22aa572a8a126440294de6fe65b"
SRC_URI[sha256sum] = "b2f776c595519570f2faa64bb50c5ba6da2c10d078b51bb0608f9d659e8902ca"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/org/kde/${BPN}/.debug"

RRECOMMENDS_${PN} += "udisks2"
