SUMMARY = "Pty abstraction"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kcoreaddons ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "bf119f71086e84e362a78bc5a798efc4"
SRC_URI[sha256sum] = "ab3263f7b934862ff2ac9b8531ea5c3e4896f6c223705cc8c1b0aa2beebcd981"

CMAKE_ALIGN_SYSROOT[1] = "KF5Pty, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Pty, -S${includedir}, -S${STAGING_INCDIR}"

