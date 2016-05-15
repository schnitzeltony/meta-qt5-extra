SUMMARY = "Embedded JS"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5-porting-aids cmake-lib

DEPENDS += " \
    ${BPN}-native \
    qtsvg \
    qttools \
    kjs \
    ki18n \
    kdoctools \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e2da4d29c79b317af0728673d7609fd7"
SRC_URI[sha256sum] = "8b1f19f93c9154f7f34c4c6ee11748b97f647da4d18e5c86a420235a2a0d8c39"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5JsEmbed, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5JsEmbed, -S${includedir}, -S${STAGING_INCDIR}"

# kjsembed's kjscmd5 is not required for build -> point to native dummy to make cmake happy
CMAKE_ALIGN_SYSROOT[3] = "KF5JsEmbed, -S${bindir}/kjscmd5, -S${STAGING_BINDIR_NATIVE}/kjscmd5"
