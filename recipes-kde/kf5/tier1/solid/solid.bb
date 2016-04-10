SUMMARY = "Hardware integration and detection"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0b83cbdd8985c9a2b115523da9db02a9"
SRC_URI[sha256sum] = "5914713e9090be468bf0e3c287ff7de811ba0f16ba4a4c7979db647d1cfb298f"

CMAKE_ALIGN_SYSROOT[1] = "KF5Solid, -S${libdir}, -S${STAGING_LIBDIR}"
CMAKE_ALIGN_SYSROOT[2] = "KF5Solid, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/org/kde/${BPN}/.debug"

RRECOMMENDS_${PN} += "udisks2"
