SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kconfig kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a72bf104bd073134e4bdf77dbf6677ab"
SRC_URI[sha256sum] = "deb2c24d995b8b6aa57309980f45fad49739bef693b1286bebc383f11c0801d7"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Completion, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Completion, -S${includedir}, -S${STAGING_INCDIR}"
