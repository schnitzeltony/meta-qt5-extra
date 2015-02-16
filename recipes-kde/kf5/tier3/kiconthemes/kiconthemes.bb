SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d41b5a4f68e350b1d36e05c99f060e53"
SRC_URI[sha256sum] = "4f06c930303761fc9985422cc0bb0c474f6430235adbf61378c1e943866c3984"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5IconThemes, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5IconThemes, -S${includedir}, -S${STAGING_INCDIR}"
