SUMMARY = "A library for accessing the usage data collected by the activities system"
LICENSE = "LGPLv2+"
LIC_FILES_CHKSUM = " \
	file://COPYING.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
	file://COPYING.LGPL-2.1;md5=4fbd65380cdd255951079008b364516c \
	file://COPYING.LGPL-3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit kde-kf5 cmake-lib

DEPENDS += " \
    boost \
    kconfig \
    kactivities \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3698b95f2dae16a041445872607ccf0b"
SRC_URI[sha256sum] = "0e7bd822ddb9f110e0a0d79afe3332066c6466347e608ded7a0f6411d00aa06d"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5ActivitiesStats, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5ActivitiesStats, -S${includedir}, -S${STAGING_INCDIR}"
