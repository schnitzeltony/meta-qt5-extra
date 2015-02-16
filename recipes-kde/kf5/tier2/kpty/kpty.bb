SUMMARY = "Pty abstraction"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kcoreaddons ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "27da31464d8381c228d8dd1226628659"
SRC_URI[sha256sum] = "602b305ade4e2499cbc29273e3ecb54c315925652ba3b657c7bed597ff0de169"

CMAKE_HIDE_ERROR[1] = "KF5Pty, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Pty, -S${includedir}, -S${STAGING_INCDIR}"

