SUMMARY = "Embedded JS"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5-porting-aids cmake_lib

DEPENDS += " \
    ${BPN}-native \
    qtsvg \
    qttools \
    kjs \
    ki18n \
    kdoctools \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "09aa2aaaf346861d28a28e44c53b894a"
SRC_URI[sha256sum] = "4b60cae1b4672764d77dd1b6376f8cf3c01684bf24ad24740596d740a8d882c8"

# kjsembed's kjscmd5 is not required for build -> point to native dummy to make cmake happy
CMAKE_ALIGN_SYSROOT[1] = "KF5JsEmbed, -s${_IMPORT_PREFIX}/bin/kjscmd5, -S${STAGING_BINDIR_NATIVE}/kjscmd5"
