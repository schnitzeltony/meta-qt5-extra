SUMMARY = "Pty abstraction"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kcoreaddons ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5aa1042ffd8bab0df514f8a043e7511a"
SRC_URI[sha256sum] = "da89f8af42fe518e7931e84c3d6b1e868d9e9c03aa959be29c731475f16f7bf9"

CMAKE_ALIGN_SYSROOT[1] = "KF5Pty, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Pty, -S${includedir}, -S${STAGING_INCDIR}"

