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
SRC_URI[md5sum] = "b3766523100d1e07d4c6adce10609af1"
SRC_URI[sha256sum] = "ecfe2a33b9cebe20a58ffce2b0e493a7c5cbae8fbe77d5c52aa0adeee2dd7dfc"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5ActivitiesStats, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5ActivitiesStats, -S${includedir}, -S${STAGING_INCDIR}"
