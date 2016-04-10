SUMMARY = "Pty abstraction"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kcoreaddons ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b6b51b6832faf2fb52d53e8bd6b62852"
SRC_URI[sha256sum] = "ac8c46660d34a9abf7ed23ebfb86eb7bec461268f0946cd4d6fa3df954bdefef"

CMAKE_ALIGN_SYSROOT[1] = "KF5Pty, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Pty, -S${includedir}, -S${STAGING_INCDIR}"

