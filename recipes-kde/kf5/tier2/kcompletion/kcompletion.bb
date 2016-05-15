SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kconfig kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5f49157875b01a780049b472df5d5213"
SRC_URI[sha256sum] = "feef5c55d9ccee727431a7a547e354da08f34eccea37257cd3b8bdd85a96581e"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Completion, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Completion, -S${includedir}, -S${STAGING_INCDIR}"
