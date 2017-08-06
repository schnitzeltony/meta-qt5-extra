SUMMARY = "A library for accessing the usage data collected by the activities system"
LICENSE = "LGPLv2+"
LIC_FILES_CHKSUM = " \
	file://COPYING.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
	file://COPYING.LGPL-2.1;md5=4fbd65380cdd255951079008b364516c \
	file://COPYING.LGPL-3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit kde-kf5

DEPENDS += " \
    boost \
    kconfig \
    kconfig-native \
    kactivities \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d6652f6a8601434104a0719a70bc24f2"
SRC_URI[sha256sum] = "10fdc3ead08aac011b3c6535743c6d172f60a8e31134050e9c840862d4dbf7c1"
