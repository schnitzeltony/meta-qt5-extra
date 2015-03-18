SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3f579762a22fa0c91731ea8d2c44cbb5"
SRC_URI[sha256sum] = "11631f3f64bc54d80d1b0ce0d11318e50daec2d64efa91154b1929596a54342f"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Bookmarks, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Bookmarks, -S${includedir}, -S${STAGING_INCDIR}"
