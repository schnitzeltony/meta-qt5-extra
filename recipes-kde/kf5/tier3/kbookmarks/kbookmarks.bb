SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "65100bbdf0f80c21e3f7c25e781fa483"
SRC_URI[sha256sum] = "fdae0ca3d9e2617b1d4c318a0fef586ad7147db630fef68cbb2b061c138f1b22"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Bookmarks, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Bookmarks, -S${includedir}, -S${STAGING_INCDIR}"
