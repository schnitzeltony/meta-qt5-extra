SUMMARY = "Hardware integration and detection"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRCREV = "5ec75ac1daf0fc3b016e138590b0429b2ab4934e"
S = "${WORKDIR}/git"

CMAKE_HIDE_ERROR[1] = "KF5Solid, -S${libdir}, -S${STAGING_LIBDIR}"
CMAKE_HIDE_ERROR[2] = "KF5Solid, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${libdir}/qml"
FILES_${PN}-dbg += "${libdir}/qml/org/kde/${BPN}/.debug"
