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
SRC_URI[md5sum] = "179ba5f3e126f04461df16c44a6cf0dc"
SRC_URI[sha256sum] = "f172a8be312119ad8fddbd64c76519b37b6977445858be20eeca9aa5ac31bd65"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5ActivitiesStats, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5ActivitiesStats, -S${includedir}, -S${STAGING_INCDIR}"
