SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kconfig kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e0542f7b67153e79efcdbb0877979775"
SRC_URI[sha256sum] = "8d3fe5f6c3438c20ea552fffde479a616f9559d1124c631f278cade166f1c016"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Completion, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Completion, -S${includedir}, -S${STAGING_INCDIR}"
