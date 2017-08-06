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
SRC_URI[md5sum] = "79e3d7c3b4674d1979b4d508d6909bc1"
SRC_URI[sha256sum] = "49bf01a91f227d7daa1b41f1e792054a814de4f1783c4a44a316123fbb938580"

# kjsembed's kjscmd5 is not required for build -> point to native dummy to make cmake happy
CMAKE_ALIGN_SYSROOT[1] = "KF5JsEmbed, -s${_IMPORT_PREFIX}/bin/kjscmd5, -s${KDE_PATH_EXTERNAL_HOST_BINS}/kjscmd5"
