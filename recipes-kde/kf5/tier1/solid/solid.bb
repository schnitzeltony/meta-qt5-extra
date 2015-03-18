SUMMARY = "Hardware integration and detection"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "85fa6a920e9634af9cd2acdf2aca71a9"
SRC_URI[sha256sum] = "03fb4206f025eed4f87a453311a6e620430072114b929e8a225e28fa0a8c121f"

CMAKE_HIDE_ERROR[1] = "KF5Solid, -S${libdir}, -S${STAGING_LIBDIR}"
CMAKE_HIDE_ERROR[2] = "KF5Solid, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${libdir}/qml"
FILES_${PN}-dbg += "${libdir}/qml/org/kde/${BPN}/.debug"
