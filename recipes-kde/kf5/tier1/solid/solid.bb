SUMMARY = "Hardware integration and detection"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "763c77540a984d28e00be0026aea8b14"
SRC_URI[sha256sum] = "24dc18630476db845af6a14553659c91a40b36d6c4ebbca470e061cbd9c2bf29"

CMAKE_HIDE_ERROR[1] = "KF5Solid, -S${libdir}, -S${STAGING_LIBDIR}"
CMAKE_HIDE_ERROR[2] = "KF5Solid, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${libdir}/qml"
FILES_${PN}-dbg += "${libdir}/qml/org/kde/${BPN}/.debug"
