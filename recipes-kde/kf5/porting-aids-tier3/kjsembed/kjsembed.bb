SUMMARY = "Embedded JS"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5-porting-aids cmake_lib gettext

DEPENDS += " \
    ${BPN}-native \
    qtsvg \
    qttools \
    kjs \
    ki18n \
    kdoctools \
    kdoctools-native \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7ba6a5d29f8b278a00dc4e12923aa1e2"
SRC_URI[sha256sum] = "ebcd97eaa6a5e36f6af7201e10f716aaab3a8cda984ce6b115a8274072f778c4"

# kjsembed's kjscmd5 is not required for build -> point to native dummy to make cmake happy
CMAKE_ALIGN_SYSROOT[1] = "KF5JsEmbed, -s${_IMPORT_PREFIX}/bin/kjscmd5, -s${KDE_PATH_EXTERNAL_HOST_BINS}/kjscmd5"
