SUMMARY = "Hardware integration and detection"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "cfe8a78e9e0e9e06a9cdb2295fcdef66"
SRC_URI[sha256sum] = "96e38e4aa1c3bbc77557dd608552e2d1dc78b7300f7c2a62846ebd43afec18fd"

CMAKE_ALIGN_SYSROOT[1] = "KF5Solid, -S${libdir}, -S${STAGING_LIBDIR}"
CMAKE_ALIGN_SYSROOT[2] = "KF5Solid, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${libdir}/qml"
FILES_${PN}-dbg += "${libdir}/qml/org/kde/${BPN}/.debug"
