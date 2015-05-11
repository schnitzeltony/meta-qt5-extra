SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d38403bae03ff23e685894e3ffe6b70f"
SRC_URI[sha256sum] = "bcf9b522fb2a906fbf83d23b0ed85d9ab541f68344600d6bd5a70c8b762f1610"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Bookmarks, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Bookmarks, -S${includedir}, -S${STAGING_INCDIR}"
