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
SRC_URI[md5sum] = "ed8d52c80ab57166d4ac0b30213bb149"
SRC_URI[sha256sum] = "4456808a6fbc595bd62235085e4aba2f18665e884220159b3cbe4653cd343525"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5JsEmbed, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5JsEmbed, -S${includedir}, -S${STAGING_INCDIR}"

# kjsembed's kjscmd5 is not required for build -> point to native dummy to make cmake happy
CMAKE_ALIGN_SYSROOT[3] = "KF5JsEmbed, -S${bindir}/kjscmd5, -S${STAGING_BINDIR_NATIVE}/kjscmd5"
