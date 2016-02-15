SUMMARY = "Hardware integration and detection"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d664fa2d968c6d6a273881e90f749c7e"
SRC_URI[sha256sum] = "ff4dabd1d1ab038a22d4a90f4f4eca83e96f22ce07fa090b36b994c534dc7609"

CMAKE_ALIGN_SYSROOT[1] = "KF5Solid, -S${libdir}, -S${STAGING_LIBDIR}"
CMAKE_ALIGN_SYSROOT[2] = "KF5Solid, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/org/kde/${BPN}/.debug"

RRECOMMENDS_${PN} += "udisks2"
