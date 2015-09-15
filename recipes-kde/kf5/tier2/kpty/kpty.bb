SUMMARY = "Pty abstraction"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kcoreaddons ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a08cbe17b90a6757affb443cb7cbd499"
SRC_URI[sha256sum] = "d2b447874cb09d4621b7c66c1db2a5aa6526449f91de9069b02e28f309f5ca53"

CMAKE_ALIGN_SYSROOT[1] = "KF5Pty, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Pty, -S${includedir}, -S${STAGING_INCDIR}"

