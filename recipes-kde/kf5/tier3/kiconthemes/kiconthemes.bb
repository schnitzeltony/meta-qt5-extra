SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c7e44b909ad5ff372dfd2a2341e09e0f"
SRC_URI[sha256sum] = "638216de3c9fba6249c0e2e3ce0c779b89c4b20683f1a3c1d8ea82952b7ffcb9"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5IconThemes, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5IconThemes, -S${includedir}, -S${STAGING_INCDIR}"
