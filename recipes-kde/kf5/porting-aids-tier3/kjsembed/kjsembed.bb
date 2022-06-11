SUMMARY = "Embedded JS"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5-porting-aids gettext

DEPENDS += " \
    qtsvg \
    qttools \
    kjs \
    ki18n \
    kdoctools \
    kdoctools-native \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "f3ce37479d0f579feeeebc837074b3d138a37989884149b92f12b107fedef62e"
