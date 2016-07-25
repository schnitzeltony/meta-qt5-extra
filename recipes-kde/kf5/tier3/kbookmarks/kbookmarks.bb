SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9c9f20e6fa1e47bd9d5f490399a56fdb"
SRC_URI[sha256sum] = "567a8a8908aa1a0963728a473f7c44391ae79ac36ca45f570397e7b5a16da881"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Bookmarks, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Bookmarks, -S${includedir}, -S${STAGING_INCDIR}"
