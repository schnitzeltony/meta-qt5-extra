SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6e2b1a57d02cd44afb8006a70dd80470"
SRC_URI[sha256sum] = "cf689741667ce14a04fcc503fdce316bb9bc8a990893d1e46541aad6162fb863"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Bookmarks, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Bookmarks, -S${includedir}, -S${STAGING_INCDIR}"
