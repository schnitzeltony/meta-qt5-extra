SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "bebd631369a52c8ce3b168f033688a8d"
SRC_URI[sha256sum] = "60e5c34a16af7c4bb67785756e301de765604b518bddb3adb4765ac75f9fa92a"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5IconThemes, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5IconThemes, -S${includedir}, -S${STAGING_INCDIR}"
