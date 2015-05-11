SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f552e96c2fe42a0f1d6e3c46ab8bfb49"
SRC_URI[sha256sum] = "419e870310e7ec85f95e44946424467a15b93efe8588439a4468904687797ba7"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5IconThemes, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5IconThemes, -S${includedir}, -S${STAGING_INCDIR}"
