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
SRC_URI[md5sum] = "dcae4f0b65f53a64b4c6296fbe03be97"
SRC_URI[sha256sum] = "a71f358ff922d56b5fe7cbd19a0e9183106d1961883ca54f1db2e5d47281abef"

# kjsembed's kjscmd5 is not required for build -> point to native dummy to make cmake happy
CMAKE_ALIGN_SYSROOT[1] = "KF5JsEmbed, -s${_IMPORT_PREFIX}/bin/kjscmd5, -s${KDE_PATH_EXTERNAL_HOST_BINS}/kjscmd5"
