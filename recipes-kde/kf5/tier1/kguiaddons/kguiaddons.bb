SUMMARY = "Addons to QtGui"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += " \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "72bbb6968084cf6ecb9c9cb3a09d177d"
SRC_URI[sha256sum] = "f6b34db7c21ced8179351f2bf38c7c073fa4e0f6de2f9d03986aedba4f87488d"
