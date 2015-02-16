SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c741e9e3fc6451841a62dc1e7deb6c66"
SRC_URI[sha256sum] = "14297ff266c260e81dc94d2d882583f4dc35399926afacae5025ebaf73e463ef"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Bookmarks, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Bookmarks, -S${includedir}, -S${STAGING_INCDIR}"
