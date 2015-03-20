SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kconfig kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d8c49357e334f5992df7a0863b08bed7"
SRC_URI[sha256sum] = "8b830f1b58f1f0b618455d8be08b48b117530e45e3207f23f5a7e3958dfe278f"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Completion, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Completion, -S${includedir}, -S${STAGING_INCDIR}"
