SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "baf1c82110ab626ef8f1cafc80571490"
SRC_URI[sha256sum] = "b0bc40bf85e09e647552906d0c2f156462b7585cf2717b89138f27784ef4aa1f"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Bookmarks, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Bookmarks, -S${includedir}, -S${STAGING_INCDIR}"
