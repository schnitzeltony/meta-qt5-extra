SUMMARY = "Hardware integration and detection"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "638ffa2688035952721407ddf6010ea8"
SRC_URI[sha256sum] = "828f6444430eb8ced5cfd1d1d3886d0d25cd42e14671718a900b522f5ef94711"

CMAKE_ALIGN_SYSROOT[1] = "KF5Solid, -S${libdir}, -S${STAGING_LIBDIR}"
CMAKE_ALIGN_SYSROOT[2] = "KF5Solid, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/org/kde/${BPN}/.debug"

RRECOMMENDS_${PN} += "udisks2"
