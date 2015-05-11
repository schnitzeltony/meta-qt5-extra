SUMMARY = "Hardware integration and detection"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d4b3126bd3f64ecc4c6478c7c2108f79"
SRC_URI[sha256sum] = "c4a03cc4d9f3f72489371d8bf64ca3f2478d2a3603f240af60cec934585cc3e3"

CMAKE_ALIGN_SYSROOT[1] = "KF5Solid, -S${libdir}, -S${STAGING_LIBDIR}"
CMAKE_ALIGN_SYSROOT[2] = "KF5Solid, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${libdir}/${QT_DIR_NAME}/qml"
FILES_${PN}-dbg += "${libdir}/${QT_DIR_NAME}/qml/org/kde/${BPN}/.debug"

RRECOMMENDS_${PN} += "udisks2"
